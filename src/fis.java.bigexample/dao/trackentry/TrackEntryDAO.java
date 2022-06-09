package fis.java.bigexample.dao.trackentry;

import fis.java.bigexample.model.TrackEntry;

import java.util.ArrayList;

public class TrackEntryDAO implements ITrackEntry {
    ArrayList<TrackEntry> listTrackEntry = new ArrayList<>();

    @Override
    public void add(TrackEntry trackEntry) throws Exception {
        checkExisted(trackEntry);
        listTrackEntry.add(trackEntry);
    }

    @Override
    public TrackEntry update(TrackEntry trackEntry) {
        try {
            findById(trackEntry.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return update(trackEntry);
    }
    private void checkExisted(TrackEntry trackEntry) throws Exception {
        for (TrackEntry trackEntry1 : listTrackEntry) {
            if (trackEntry.getId() == trackEntry1.getId()) {
                throw new Exception(trackEntry.getId() + "is already existed!");
            }
        }
    }

    @Override
    public void delete(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to delete!");
        }
        TrackEntry trackEntry = findById(id);
        listTrackEntry.remove(trackEntry);
    }

    private boolean isEmpty(long id) {
        if (String.valueOf(id).length() == 0) {
            return false;
        }
        return true;

    }

    @Override
    public ArrayList<TrackEntry> getAll() {
        return listTrackEntry;
    }

    @Override
    public TrackEntry findById(long id) throws Exception {
        if (isEmpty(id)) {
            throw new Exception("Enter an ID to find!");
        }
        for (int i = 0; i < listTrackEntry.size(); i++) {
            if (listTrackEntry.get(i).getId() == id) {
                return listTrackEntry.get(i);
            }
        }
        throw new Exception("Cannot find track entry with ID: " + id);
    }
}

