package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Välkommen! Vad vill du göra?");
        System.out.println("1. Visa meddelanden");
        System.out.println("2. Lägg till meddelande");
        System.out.println("3. Uppdatera meddelande");
        System.out.println("4. Spara meddelanden till fil");
        System.out.println("5. läs in meddelande från fil");
        System.out.println("6. Avsluta");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                System.out.println("Insert message");
                String msg = sc.next();
                Message test = new Message(msg);

//                Message.checkMsg(msg);
                break;
            case 3:
                System.out.println("3");
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
}
