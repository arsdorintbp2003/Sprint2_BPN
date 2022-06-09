package fis.java.bigexample.dao.trackentry;

import fis.java.bigexample.model.TrackEntry;

import java.util.ArrayList;

public interface ITrackEntry {
    public void add(TrackEntry trackEntry) throws Exception;
    public void delete(long id) throws Exception;
    public TrackEntry findById(long id) throws Exception;
    public TrackEntry update(TrackEntry trackEntry);
    public ArrayList<TrackEntry> getAll();

}
