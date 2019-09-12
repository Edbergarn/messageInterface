package com.company;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        ArrayList<Message> messages = new ArrayList<Message>();
        while (true) {
            menu();
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    messages = readMessages();
                    ArrayList<Message> finalMessages = messages;
                    messages.forEach((n) -> System.out.println("" + (finalMessages.indexOf(n) + 1) + " " + n.toString()));
                    break;
                case 2:
                    System.out.println("Insert message");
                    msg = getMsg();
                    messages.add(new Message(msg));
                    System.out.println(messages);
                    saveMessages(messages);

//                Message.checkMsg(msg);
                    break;
                case 3:
                    //What message to update
                    System.out.println("What message do you want to update?");
                    int update = sc.nextInt();
                    System.out.println("Insert new message");
                    msg = getMsg();
                    messages.get((update - 1)).update(msg);
                    saveMessages(messages);

                    /*msg = getMsg();
                    test = new Message(msg);
                    test.update(msg);
                    System.out.println(test.toString());


                     */
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
                default:
                    System.out.println("Vänligen skriv en siffra mellan 1-6");
            }
        }
    }

    /*private static void save(Message msg){
        try {
            ArrayList<Message> a = readMessages();
            String tmp = a.toString();
            PrintWriter pw = new PrintWriter(new FileOutputStream("myObjects.txt"));
            pw.write(tmp);
            pw.close();
            //FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            //ObjectOutputStream o = new ObjectOutputStream(f);

            a.add(msg);
            System.out.println(a);
            // Write objects to file
            //o.writeObject(a);

            //o.close();
            //f.close();
            System.out.println("Saved message");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // write your code here
    }

     */
    private static void saveMessages(ArrayList<Message> messages) {
        try {
            FileOutputStream fo = new FileOutputStream(new File("messages.txt"));
            ObjectOutputStream oo = new ObjectOutputStream(fo);

            oo.writeObject(messages);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<Message> readMessages() {
        ArrayList<Message> messages = new ArrayList<Message>();

        try {
            FileInputStream fi = new FileInputStream("messages.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            messages = (ArrayList<Message>) oi.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return messages;
    }
    /*private static ArrayList getHistory(){
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            Scanner scan = new Scanner(fileIn);
            String loadedClubs = scan.next();
            a.add(loadedClubs);

            //FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            //ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            ArrayList<Message> a = new ArrayList<Message>();
            Message pr1 = (Message) oi.readObject();
            a.add(pr1);

            System.out.println(pr1.toString());

            oi.close();
            fi.close();
            return a;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    private static String getMsg() {
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
