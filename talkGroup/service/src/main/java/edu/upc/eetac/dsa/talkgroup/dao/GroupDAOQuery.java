package edu.upc.eetac.dsa.talkgroup.dao;

/**
 * Created by SergioGM on 29.10.15.
 */
public class GroupDAOQuery {
    public final static String UUID = "select REPLACE(UUID(),'-','')";
    public final static String CREATE_GROUP = "insert into groups (id, name) values (UNHEX(?), ?);";
    public final static String GET_GROUP_BY_ID = "select hex(g.id) as id, g.name from groups g where id=unhex(?)";
    public final static String GET_GROUP_BY_NAME = "select hex(g.id) as id, g.name from groups g where g.name=?";
    public final static String DELETE_GROUP = "delete from groups where id=unhex(?)";
}
