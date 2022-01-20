package ru.itacademy.collaborators;

public class Manager extends Personal implements ActionsWithPersonnel {

    public Manager(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    public void control() {
        System.out.println("Контроль за состоянием магазина");
    }

    public void orderingProducts() {
        System.out.println("Заказ продукции");
    }

    @Override
    public void greeting() {
        System.out.println("Здравствуйте, меня зовут " + getName() + ", я управляющий этого магазина.");
    }

    @Override
    public void work() {
        System.out.println("Я работаю!");
    }

    @Override

    public void takeVacation() {
        System.out.println("Нужно взять отпуск.");
    }

    @Override

    public void toSell() {
        System.out.println("Работа за кассой.");
    }

    @Override

    public void acceptingPayments() {
        System.out.println("Принятие платежей.");
    }
}

