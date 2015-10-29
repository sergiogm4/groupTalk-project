package edu.upc.eetac.dsa.talkgroup.dao;

import java.sql.SQLException;

/**
 * Created by SergioGM on 28.10.15.
 */
public interface UserGroupDAO {
    public boolean joinGroup(String userid, String groupid) throws SQLException, UserIsAlreadyInGroupException;
    public boolean leaveGroup(String userid, String groupid) throws SQLException;
    public boolean checkUserGroup(String userid, String groupid) throws SQLException;

}
