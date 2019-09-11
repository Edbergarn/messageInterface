package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int i = sc.nextInt();
        String msg;
        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("Insert message");
                msg = getMsg();
                Message test = new Message(msg);
                System.out.println(test.toString());

//                Message.checkMsg(msg);
                break;
            case 3:
                //What message to update
                System.out.println("Insert updated message");
                msg = getMsg();
                test = new Message(msg);
                test.update(msg);
                System.out.println(test.toString());

                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("Exiting B, Exiting B don't kill me");
                System.exit(0);
                break;
        }

        // write your code here
    }
    private static String getMsg(){
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        return msg;
    }

    private static void menu() {
        System.out.println("Välkommen! Vad vill du göra?");
        System.out.println("1. Visa meddelanden");
        System.out.println("2. Lägg till meddelande");
        System.out.println("3. Uppdatera meddelande");
        System.out.println("4. Spara meddelanden till fil");
        System.out.println("5. läs in meddelande från fil");
        System.out.println("6. Avsluta");
    }
}
