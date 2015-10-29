package edu.upc.eetac.dsa.talkgroup.dao;

import edu.upc.eetac.dsa.talkgroup.entity.Group;

import java.sql.SQLException;

/**
 * Created by SergioGM on 28.10.15.
 */
public interface GroupDAO {
    public Group createGroup(String name) throws SQLException, GroupAlreadyExistsException;

    public Group getGroupById(String id) throws SQLException;

    public Group getGroupByName(String name) throws SQLException;

    public boolean deleteGroup(String id) throws SQLException;

}
