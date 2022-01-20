package ru.itacademy.collaborators;

public class Manager extends Personal {

    public Manager(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    Manager manager = new Manager("Elena", "female", 27, "management");

    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
