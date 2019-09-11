package com.company;

import java.sql.SQLOutput;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Message {
    private Date createdAt;
    private Date updatedAt;
    private String message;
    private String author = System.getProperty("user.name");

    public Message(String msg){
        if (msg.length() <= 140){
            this.createdAt = new Date();
            this.updatedAt = createdAt;
            this.message = msg;
            this.author = System.getProperty("user.name");
            toString();
        }else {
            System.out.println("Message is too long");
            System.exit(0);
        }
    }

    public String toString(){
        System.out.println();

    }
    public void update(String a){

    }
}
