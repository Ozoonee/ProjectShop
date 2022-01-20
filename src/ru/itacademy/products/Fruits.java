package ru.itacademy.products;

public class Fruits extends Products {
    String sort;
    String color;
    String packing;

    public Fruits(String name, String countryOfManufacture, double cost, double weight, String sort, String color, String packing) {
        super(name, countryOfManufacture, cost, weight);
        this.sort = sort;
        this.color = color;
        this.packing = packing;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    @Override
    void buy() {
        System.out.println("Купить товар");
    }

    @Override
    void putInTheBasket() {
        System.out.println("Положить товар в корзину");
    }

    @Override
    void readTheInformation() {
        System.out.println("Прочитать информацию о товаре");
    }
}