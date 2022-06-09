package fis.java.bigexample.dao.evidence;

import fis.java.bigexample.model.Evidence;

import java.util.ArrayList;

public interface IEvidence {
    public void add(Evidence evidence) throws Exception;
    public void remove(long id) throws Exception;
    public ArrayList<Evidence> getAll();
    public Evidence update(Evidence evidence) throws Exception;
    Evidence findEvidenceById(Long id) throws Exception;
}
