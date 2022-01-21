package ru.itacademy;

public class Buyer {
    String gender;
    int age;
    int purchasingPower;

    public Buyer(String gender, int age, int purchasingPower) {
        this.gender = gender;
        this.age = age;
        this.purchasingPower = purchasingPower;
    }

    public void spendsMoney() {
        System.out.println("Совершать покупки");
    }

    public void makeCommentAndSuggestions() {
        System.out.println("Вносить замечания и предложения по работе магазина");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPurchasingPower() {
        return purchasingPower;
    }

    public void setPurchasingPower(int purchasingPower) {
        this.purchasingPower = purchasingPower;
    }

}
