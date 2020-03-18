package com.pkg.pattern.observer;

public class Fan {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name = null;

    public void updateCelebrityStatus(String celebrityMsg) {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("i got a message from celebrity  : " + celebrityMsg);
    }
}
