package fis.java.bigexample.dao.storage;

import fis.java.bigexample.model.Storage;

import java.util.ArrayList;

public interface IStorage {
    public void add(Storage storage) throws Exception;
    public ArrayList<Storage> getAll();
    public void delete(long id) throws Exception;
    public Storage update(Storage storage) throws Exception;
    public Storage findStorageById(Long id) throws Exception;
}
