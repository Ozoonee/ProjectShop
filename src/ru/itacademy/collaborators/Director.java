package ru.itacademy.collaborators;

public class Director extends Personal implements ActionsWithPersonnel {
    public Director(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    @Override
    public void greeting() {
        System.out.println("Добрый день, меня зовут " + getName() + ", я директор этого магазина.");
    }

    public void hire(String newCollaborator){
        switch (newCollaborator) {
            case "M":
                Manager manager2 = new Manager("", "", 0, "");
                System.out.println("Новый менеджер нанят на работу.");
                break;
            case "S":
                Seller kassir3 = new Seller("", "", 0, "");
                System.out.println("Новый кассира нанят на работу.");
                break;
            case "W":
                Worker worker1 = new Worker("", "", 0, "");
                System.out.println("Новый грузчик нанят на работу.");
                break;
        }
    }

    public void promotion() {
        System.out.println("Повысить сотрудника.");
    }

    public void fire() {
        System.out.println("Уволить сотрудника.");
    }

    public void executionOfDocuments() {
        System.out.println("Работа с документацией.");
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

