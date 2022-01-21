package ru.itacademy;

import ru.itacademy.collaborators.Director;
import ru.itacademy.collaborators.Manager;
import ru.itacademy.collaborators.Seller;
import ru.itacademy.collaborators.Worker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataAndObjects {

    // О магазине
    String shopName = "Десятка";
    String type = "Продуктовый";

    // Создание персонала
    public static void createCollaborators() {
        Director director = new Director("Ekaterina", "female", 32, "HighSchool");
        Manager manager = new Manager("Elena", "female", 27, "HighSchool");
        Seller kassir = new Seller("Olga", "female", 22, "ProfessionalSchool");
        Seller kassir2 = new Seller("Anna", "female", 24, "MiddleSchool");
        Worker mover = new Worker("Ivan", "male", 40, "MiddleSchool");
    }

    // Режим работы магазина
    public static void time() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, EEEE HH:mm");
        Date date = new Date();
        if (date.getHours() >= 21 | date.getHours() <= 8) {
            System.out.println("Магазин закрыт до 8.00");
        } else
            System.out.println("Магазин открыт до 21.00");
    }
}
