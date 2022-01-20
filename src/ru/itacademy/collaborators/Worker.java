package ru.itacademy.collaborators;

public class Worker extends Personal {


    public Worker(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    Worker mover = new Worker("Ivan", "male", 40, "Middle school");

    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
