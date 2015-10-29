package edu.upc.eetac.dsa.talkgroup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Created by SergioGM on 29.10.15.
 */
public class UserGroupDAOImpl implements UserGroupDAO{

    @Override
    public boolean joinGroup(String userid, String groupid) throws SQLException, UserIsAlreadyInGroupException{
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            boolean already  = checkUserGroup(userid, groupid);
            if (already != false)
                throw new UserIsAlreadyInGroupException();

            connection = Database.getConnection();

            stmt = connection.prepareStatement(UserGroupDAOQuery.JOIN_GROUP);
            stmt.setString(1, userid);
            stmt.setString(2, groupid);
            stmt.executeUpdate();

            stmt.close();


            connection.commit();
        } catch (SQLException e) {
            throw e;
        } finally {
            if (stmt != null) stmt.close();

            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }
        }
        return true;
    }

    @Override
    public boolean leaveGroup(String userid, String groupid) throws SQLException{
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            connection = Database.getConnection();

            stmt = connection.prepareStatement(UserGroupDAOQuery.LEAVE_GROUP);
            stmt.setString(1, userid);
            stmt.setString(2, groupid);

            int rows = stmt.executeUpdate();
            return (rows == 1);
        } catch (SQLException e) {
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (connection != null) connection.close();
        }
    }

    @Override
    public boolean checkUserGroup(String userid, String groupid) throws SQLException{
        Connection connection = null;
        PreparedStatement stmt = null;
        try {
            connection = Database.getConnection();

            stmt = connection.prepareStatement(UserGroupDAOQuery.CHECK_GROUP_FROM_ID );
            stmt.setString(1, userid);
            stmt.setString(2, groupid);

            int rows = stmt.executeUpdate();
            return (rows == 1);
        } catch (SQLException e) {
            throw e;
        } finally {
            if (stmt != null) stmt.close();
            if (connection != null) connection.close();
        }
    }
}
