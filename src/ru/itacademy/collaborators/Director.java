package ru.itacademy.collaborators;

public class Director extends Personal implements ActionsWithPersonnel {

    public Director(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    public void hire() {
        System.out.println("Нанять на работу нового сотрудника");
    }

    public void promotion() {
        System.out.println("Повысить сотрудника");
    }

    public void fire() {
        System.out.println("Уволить сотрудника");
    }

    public void executionOfDocuments() {
        System.out.println("Работа с документацией");
    }

    @Override
    public void greeting() {
        System.out.println("Добрый день, меня зовут " + getName() + ", я директор этого магазина.");
    }

    @Override
    public void work() {
        System.out.println("Я работаю, не мешай!");
    }

    @Override
    public void takeVacation() {
        System.out.println("Пора на Мальдивы.");
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
