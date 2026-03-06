package com.markedexiled.learn3;

public class Cat extends Animal {

    public Cat()
    {
        super("Orange",4);
    }

    @Override
    public void jumpHeight()
    {
        System.out.println("A cat jumps 1 meter in the air.");
    }
}
