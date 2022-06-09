package fis.java.bigexample.dao.storage;

import fis.java.bigexample.model.Storage;

import java.util.ArrayList;

public class StorageDAO implements IStorage {
    ArrayList<Storage> listStorage = new ArrayList<>();
    @Override
    public void add(Storage storage) throws Exception {
        checkExisted(storage);
        listStorage.add(storage);
    }
    @Override
    public Storage update(Storage storage) throws Exception {
        findStorageById(storage.getId());
        return update(storage);
    }
    private void checkExisted(Storage storage) throws Exception {
        for (Storage storage1 : listStorage) {
            if (storage.getId() == storage1.getId()) {
                throw new Exception(storage.getId() + "is already existed!");
            }
        }
    }
    @Override
    public void delete(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to remove!");
        }
        Storage storage = findStorageById(id);
        listStorage.remove(storage);
    }
    @Override
    public ArrayList<Storage> getAll() {
        return listStorage;
    }
    @Override
    public Storage findStorageById(Long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter An Id To Find!");
        }
        for (int i = 0; i < listStorage.size(); i++ ) {
            if (listStorage.get(i).getId() == id) {
                return listStorage.get(i);
            }
        }
        throw new Exception("Cannot find storage with ID: " + id);
    }
    private boolean isEmpty(long id) {
        if (String.valueOf(id).length() == 0 ) {
            return false;
        }
        return true;
    }
}
