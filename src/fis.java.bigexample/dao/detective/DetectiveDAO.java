package fis.java.bigexample.dao.detective;

import fis.java.bigexample.model.Detective;

import java.util.ArrayList;

public class DetectiveDAO implements IDetective {
    private ArrayList<Detective> listDetective = new ArrayList<>();
    @Override
    public void add(Detective detective) throws Exception {
        checkExisted(detective);
        listDetective.add(detective);
    }
    @Override
    public Detective update(Detective detective) throws Exception {
        findDetectiveById(detective.getId());
        return update(detective);
    }

    @Override
    public Detective findDetectiveById(Long id) throws Exception {
        return null;
    }

    private void checkExisted(Detective detective) throws Exception {
        for (Detective detective1 : listDetective) {
            if (detective.getId() == detective1.getId()) {
                throw new Exception(detective.getId() + "is already existed!");
            }
        }
    }
    private boolean isEmpty(long id) {
        if(String.valueOf(id).length() == 0 ){
            return false;
        }
        return true;
    }
    @Override
    public void remove(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to remove!");
        }
        Detective detective = findDetectiveById(id);
        listDetective.remove(detective);
    }
    public Detective findDetectiveById(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter An Id To Find!");
        }
        for (int i = 0; i < listDetective.size(); i++) {
            if (listDetective.get(i).getId() == id) {
                return listDetective.get(i);
            }
        }
        throw new Exception("Cannot find detective with ID: " + id);
    }

    @Override
    public ArrayList<Detective> getAll() {
        return listDetective;
    }
}
