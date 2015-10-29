package edu.upc.eetac.dsa.talkgroup.dao;

import edu.upc.eetac.dsa.talkgroup.entity.Theme;
import edu.upc.eetac.dsa.talkgroup.entity.ThemeCollection;

import java.sql.SQLException;

/**
 * Created by SergioGM on 28.10.15.
 */
public interface ThemeDAO {
    public Theme createTheme(String userid, String groupid, String subject, String content) throws SQLException;
    public Theme getThemeById(String id) throws SQLException;
    public ThemeCollection getThemesByGroupId(String groupid) throws SQLException;
    public Theme updateTheme(String id, String subject, String content) throws SQLException;
    public boolean deleteTheme(String id) throws SQLException;
}
