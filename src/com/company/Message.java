package com.company;

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
            message = msg;
        }else {
            System.out.println("Message is too long");
            System.exit(0);
        }
    }
}
