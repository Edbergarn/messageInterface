package com.company;

import java.sql.SQLOutput;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Message {
    private  Date createdAt;
    private Date updatedAt;
    private  String message;
    private  String author;

    public Message(String msg){
        if (msg.length() <= 140){
            this.createdAt = new Date();
            this.message = msg;
            this.author = System.getProperty("user.name");
        }else {
            System.out.println("Message is too long");
            System.exit(0);
        }
    }
    public String toString(){
        String a;
        if (updatedAt == null){
            return "\"" + message + "\", Created by " + author + " at " + createdAt;

        }else {
            return "\"" + message + "\", Updated by " + author + " at " + updatedAt;
        }
    }
    public void update(String msg){
        if (msg.length() <= 140){
            this.updatedAt = new Date();
            this.message = msg;
            this.author = System.getProperty("user.name");
        }else {
            System.out.println("Message is too long");
            System.exit(0);
        }

    }
}
