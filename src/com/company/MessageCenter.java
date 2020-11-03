package com.company;
public class MessageCenter {
    static boolean showMessage = true;

    public static void DebugMessage (String Message) {
        if(showMessage) {System.out.println(Message); }
    }
}
