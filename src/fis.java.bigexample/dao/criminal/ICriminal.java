package fis.java.bigexample.dao.criminal;

import fis.java.bigexample.model.CriminalCase;

public interface ICriminal {
    void add(CriminalCase criminalCase) throws Exception;
    public CriminalCase update(CriminalCase criminalCase) throws Exception;
    public void delete(long id) throws Exception;
    CriminalCase findCriminalCaseByID(long id) throws Exception;

}
