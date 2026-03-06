package com.markedexiled.learn3;

public class Lion extends Animal{
    public Lion()
    {
        super("Yellow",4);
    }

    @Override
    public void jumpHeight()
    {
        System.out.println("A Lion jumps 5 meters in the air.");
    }
}
