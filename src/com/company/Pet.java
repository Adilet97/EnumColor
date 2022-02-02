package com.company;

import java.util.Random;

public final class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter address : " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
