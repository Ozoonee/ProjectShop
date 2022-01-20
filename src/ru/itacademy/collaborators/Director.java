package ru.itacademy.collaborators;

public class Director extends Personal implements ActionsWithPersonnel {

    public Director(String name, String gender, int age, String education) {
        super(name, gender, age, education);
    }

    @Override
    public void greeting() {
        System.out.println("Привет, меня зовут " + getName());
    }

    private void promotion() {
        System.out.println("Повысить сотрудника");
    }

    private void fire() {
        System.out.println("Уволить сотрудника");
    }

    @Override
    public Director createNewDirector() {
        Director director = new Director("Екатерина", "female", 25, "HighSchool");
        return director;
    }
     public void test(){
    }
}
