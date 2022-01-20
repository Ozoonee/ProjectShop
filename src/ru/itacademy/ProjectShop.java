package ru.itacademy;

import ru.itacademy.collaborators.*;

public class ProjectShop {
    public static void main(String[] args) {
        Director director = new Director("Ekaterina", "female", 32, "HighSchool");
        Manager manager = new Manager("Elena", "female", 27, "HighSchool");
        Seller kassir = new Seller("Olga", "female", 22, "ProfessionalSchool");
        Seller kassir2 = new Seller("Anna", "female", 24, "MiddleSchool");
        Worker mover = new Worker("Ivan", "male", 40, "MiddleSchool");
        director.hire("S");
    }
}
