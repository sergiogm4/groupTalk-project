package edu.upc.eetac.dsa.talkgroup.dao;

/**
 * Created by SergioGM on 29.10.15.
 */
public class UserGroupDAOQuery {
    public final static String JOIN_GROUP = "insert into user_group (userid, groupid) values (UNHEX(?), unhex(?))";
    public final static String LEAVE_GROUP = "delete from user_group where userid = unhex(?) and groupid = unhex(?)";
    public final static String CHECK_GROUP_FROM_ID = "select hex(groupid) from user_group where userid=unhex(?)";
}
