package fis.java.bigexample.dao.evidence;

import fis.java.bigexample.model.Evidence;
import fis.java.bigexample.model.Storage;

import java.util.ArrayList;

public class EvidenceDAO implements IEvidence {
    ArrayList<Evidence> listEvidence = new ArrayList<>();
    @Override
    public void add(Evidence evidence) throws Exception {
        checkExisted(evidence);
        listEvidence.add(evidence);
    }
    @Override
    public Evidence update(Evidence evidence) throws Exception {
        findEvidenceById(evidence.getId());
        return update(evidence);
    }
    private void checkExisted(Evidence evidence) throws Exception {
        for (Evidence evidence1 : listEvidence) {
            if (evidence.getId() == evidence1.getId()) {
                throw new Exception(evidence.getId() + "is already existed!");
            }
        }
    }
    private boolean isEmpty(long id) {
        if (String.valueOf(id).length() == 0) {
            return false;
        }
        return true;
    }
    @Override
    public void remove(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to remove!");
        }
        Evidence evidence = findEvidenceById(id);
        listEvidence.remove(evidence);
    }
    @Override
    public Evidence findEvidenceById(Long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter An Id To Find!");
        }
        for (int i = 0; i < listEvidence.size(); i++) {
            if (listEvidence.get(i).getId() == id) {
                return listEvidence.get(i);
            }
        }
        throw new Exception("Cannot find evidence with ID: " + id);
    }

    @Override
    public ArrayList<Evidence> getAll() {
        return listEvidence;
    }


}
