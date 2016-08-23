package dao;

import java.util.List;

import entity.Beach;

public interface BeachDao {
	public List<Beach> getAllBeach();
	public Beach getBeachbyId(int id);
	public List<Beach> getBeachByState(String state);
	public Beach modifyBeach(Beach beach);
	public void deleteBeachById(int id);
    public Beach getBeachByName(String beachName);
}
