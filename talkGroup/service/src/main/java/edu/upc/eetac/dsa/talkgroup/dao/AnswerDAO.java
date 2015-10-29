package edu.upc.eetac.dsa.talkgroup.dao;

import edu.upc.eetac.dsa.talkgroup.entity.Answer;
import edu.upc.eetac.dsa.talkgroup.entity.AnswerCollection;

import java.sql.SQLException;

/**
 * Created by SergioGM on 28.10.15.
 */
public interface AnswerDAO {
    public Answer createAnswer(String userid, String themeid, String content) throws SQLException;
    public Answer getAnswerById(String id) throws SQLException;
    public AnswerCollection getAnswersByThemeId(String themeid) throws SQLException;
    public Answer updateAnswer(String id, String content) throws SQLException;
    public boolean deleteAnswer(String id) throws SQLException;
}
