package ru.itacademy.products;

public class Tea extends Products {
    String type;
    String sort;
    String color;
    String packing;

    public Tea(String name, String countryOfManufacture, double cost, double weight, String type, String sort, String color, String packing) {
        super(name, countryOfManufacture, cost, weight);
        this.type = type;
        this.sort = sort;
        this.color = color;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

}


