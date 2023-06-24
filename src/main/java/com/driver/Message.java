package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message() {
    }

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
        //method 1
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        //method 2
//        Date date = new Date();
//        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yy");
//        String str = formatter.format(date);
        this.timestamp = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
