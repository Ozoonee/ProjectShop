package ru.itacademy.collaborators;

public class Seller extends Personal implements ActionsWithPersonnel {
    public Seller(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName() + ", я кассир.");
    }

    @Override
    public void work() {
        System.out.println("Работа в зале и за кассой.");
    }

    @Override
    public void takeVacation() {
        System.out.println("Беру отпуск.");
    }

    @Override
    public void toSell() {
        System.out.println("Продажа товара");
    }

    @Override
    public void acceptingPayments() {
        System.out.println("Принятие платежей");
    }
}
