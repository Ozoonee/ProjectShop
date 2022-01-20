package ru.itacademy.collaborators;

public class Worker extends Personal {

    public Worker(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    public void work() {
        System.out.println("Таскаю грузы");
    }

    @Override
    public void greeting() {
        System.out.println("Здарова, я " + getName());
    }
}
