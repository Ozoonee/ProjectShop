package ru.itacademy.collaborators;

public class Seller extends Personal {
    public Seller(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    Seller kassir = new Seller("Dasha", "female", 22, "proffessional");

    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName());
    }
}
