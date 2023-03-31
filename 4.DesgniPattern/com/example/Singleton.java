package com.example;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("Il Singleton è stato creato!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Il Singleton sta facendo qualcosa...forse");
    }
}
