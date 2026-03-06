package com.markedexiled.learn3;

public abstract class Animal {

    private String color;
    private int legs;

    public Animal(String color, int legs){
        this.color = color;
        this.legs = legs;
    }

    public abstract void jumpHeight();

}
