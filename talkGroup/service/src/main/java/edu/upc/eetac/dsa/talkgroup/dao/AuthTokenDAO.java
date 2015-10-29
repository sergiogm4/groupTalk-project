package edu.upc.eetac.dsa.talkgroup.dao;

import edu.upc.eetac.dsa.talkgroup.auth.UserInfo;
import edu.upc.eetac.dsa.talkgroup.entity.AuthToken;

import java.sql.SQLException;

/**
 * Created by SergioGM on 28.10.15.
 */
public interface AuthTokenDAO {
    public UserInfo getUserByAuthToken(String token) throws SQLException;
    public AuthToken createAuthToken(String userid) throws SQLException;
    public void deleteToken(String userid) throws  SQLException;
}
