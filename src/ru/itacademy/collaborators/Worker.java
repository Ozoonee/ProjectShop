package ru.itacademy.collaborators;

public class Worker extends Personal {


    public Worker(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }



    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
