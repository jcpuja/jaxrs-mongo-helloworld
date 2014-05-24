package com.jcpuja.traveldiary.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jongo.marshall.jackson.oid.ObjectId;

public class Message {
    @ObjectId
    private String _id;

    @JsonProperty("message")
    private String message;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
