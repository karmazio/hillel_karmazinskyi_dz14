package com.task1;

public enum DrinksMachine {
    COFFEE("coffee"),
    TEA("tea"),
    LEMONADE("lemonade"),
    MOJITO("mojito"),
    WATER("water"),
    COKE("coke");

    private String name;

    DrinksMachine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}