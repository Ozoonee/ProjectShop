package ru.itacademy.collaborators;

public abstract class Personal {

    private String name;
    private String gender;
    private int age;
    private String education;

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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Personal(String name, String gender, int age, String education) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.education = education;
    }

    public abstract void greeting();
}

