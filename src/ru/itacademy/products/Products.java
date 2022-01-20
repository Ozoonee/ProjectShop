package ru.itacademy.products;

public abstract class Products {
    private String name;
    private String countryOfManufacture;
    private double cost;
    private double weight;

    public Products(String name, String countryOfManufacture, double cost, double weight) {
        this.name = name;
        this.countryOfManufacture = countryOfManufacture;
        this.cost = cost;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract void buy();

    abstract void putInTheBasket();

    abstract void readTheInformation();

}

