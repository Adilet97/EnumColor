package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Shelter KindHands = new Shelter("KindHands",
                "Kiev str. 7");

        Dog Tomas = new Dog("Tomas", "Labrador",
                Color.WHITE, KindHands);

        System.out.println(Tomas.getInfo());
        Tomas.makeVoice("Аув-Аув " );

        Dog Humboldt = new Dog("Humboldt", "German Shepherd", Color.BROWN,
                KindHands);
        System.out.println("\n" + Humboldt.getInfo());
        Humboldt.makeVoice("Гав гав ");

        Dog Barbos = new Dog("Barbos", "Afador", Color.BLACK,
                KindHands);
        System.out.println("\n" + Barbos.getInfo());
        Humboldt.makeVoice("Ыррр-ырррр ");
    }

}
