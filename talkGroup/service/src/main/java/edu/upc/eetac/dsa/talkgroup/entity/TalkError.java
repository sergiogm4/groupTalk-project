package edu.upc.eetac.dsa.talkgroup.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by SergioGM on 28.10.15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TalkError {
    private int status;
    private String reason;

    public TalkError() {
    }

    public TalkError(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
