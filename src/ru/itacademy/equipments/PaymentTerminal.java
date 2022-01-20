package ru.itacademy.equipments;

public class PaymentTerminal extends ElectricalEquipment {
    String contactPayment;
    String contactlessPayment;

    public String getContactPayment() {
        return contactPayment;
    }

    public void setContactPayment(String contactPayment) {
        this.contactPayment = contactPayment;
    }

    public String getContactlessPayment() {
        return contactlessPayment;
    }

    public void setContactlessPayment(String contactlessPayment) {
        this.contactlessPayment = contactlessPayment;
    }

    public PaymentTerminal(String vendor, String type, String name, int powerConsumption, int networkPowerSupply, double weight, String contactPayment, String contactlessPayment) {
        super(vendor, type, name, powerConsumption, networkPowerSupply, weight);
        this.contactPayment = contactPayment;
        this.contactlessPayment = contactlessPayment;
    }

    @Override
    public void turnOn() {
        System.out.println("Включить терминал оплаты");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить терминал оплаты");
    }

    public void conductingTransactions() {
        System.out.println("Проведение транзакций");
    }
}