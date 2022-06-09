package fis.java.bigexample.dao.detective;

import fis.java.bigexample.model.Detective;

import java.util.ArrayList;

public interface IDetective {
    public void add(Detective detective) throws Exception;
    public void remove(long id) throws Exception;
    public ArrayList<Detective> getAll();
    public Detective update(Detective detective) throws Exception;
    public Detective findDetectiveById(Long id) throws Exception;
}
