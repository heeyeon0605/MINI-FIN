package com.example.kustim_v01;

public class User {

    public static String username;
    public static String email;
    public static String name;
    public static String phone;
    public static String uid;
    public static boolean promise;
    public static boolean wakeup;
    public static boolean money;
    public static String a;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String a,String username, String email,String name, String phone, boolean promise, boolean wakeup,boolean money,String uid) {
        this.username = username;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.promise = promise;
        this.wakeup = wakeup;
        this.money = money;
        this.uid = uid;
        this.a = a;
    }

}