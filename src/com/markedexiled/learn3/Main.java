package com.markedexiled.learn3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Lion());

        for(Animal animal : animals)
        {
            animal.jumpHeight();
        }

        // note to self: apparently exercise improves understanding....
    }
}
