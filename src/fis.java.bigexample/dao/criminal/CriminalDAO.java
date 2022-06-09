package fis.java.bigexample.dao.criminal;
import fis.java.bigexample.model.CriminalCase;

import java.util.ArrayList;


public class CriminalDAO implements ICriminal {
    ArrayList<CriminalCase> listCriminalCase = new ArrayList<>();
    @Override
    public void add(CriminalCase criminalCase) throws Exception {
        checkExisted(criminalCase);
        listCriminalCase.add(criminalCase);
    }
    @Override
    public CriminalCase update(CriminalCase criminalCase) throws Exception {
        findCriminalCaseByID(criminalCase.getId());
        return update(criminalCase);
    }
    private void checkExisted(CriminalCase criminalCase) throws Exception {
        for (CriminalCase criminalCase1 : listCriminalCase) {
            if (criminalCase.getId() == criminalCase1.getId()) {
                throw new Exception(criminalCase.getId() + "is already existed!");
            }
        }
    }
    private boolean isEmpty(long id) {
        if(String.valueOf(id).length() == 0 ){
            return false;
        }
        return true;
    }
    public CriminalCase findCriminalCaseByID(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter An Id To Find!");
        }

        for (int i = 0; i < listCriminalCase.size(); i++) {
            if (listCriminalCase.get(i).getId() == id) {
                return listCriminalCase.get(i);
            }
        }
        throw new Exception("Cannot find storage with ID: " + id);
    }

    public void delete(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to remove!");
        }
        findCriminalCaseByID(id);
        listCriminalCase.remove(id);
    }
}
