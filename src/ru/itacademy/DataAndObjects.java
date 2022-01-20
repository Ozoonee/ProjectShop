package ru.itacademy;

import ru.itacademy.collaborators.Director;
import ru.itacademy.collaborators.Manager;
import ru.itacademy.collaborators.Seller;
import ru.itacademy.collaborators.Worker;

public class DataAndObjects {

// О магазине
    String shopName = "Десятка";
    String type = "продуктовый";

// Создание персонала
    public static void createCollaborators() {
        Director director = new Director("Ekaterina", "female", 32, "HighSchool");
        Manager manager = new Manager("Elena", "female", 27, "HighSchool");
        Seller kassir = new Seller("Olga", "female", 22, "ProfessionalSchool");
        Seller kassir2 = new Seller("Anna", "female", 24, "MiddleSchool");
        Worker mover = new Worker("Ivan", "male", 40, "MiddleSchool");
    }

}
