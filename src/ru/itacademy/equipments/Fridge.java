package ru.itacademy.equipments;

public class Fridge extends ElectricalEquipment {
    String operatingMode;
    int coolingTemperature;

    public String getOperatingMode() {
        return operatingMode;
    }

    public void setOperatingMode(String operatingMode) {
        this.operatingMode = operatingMode;
    }

    public int getCoolingTemperature() {
        return coolingTemperature;
    }

    public void setCoolingTemperature(int coolingTemperature) {
        this.coolingTemperature = coolingTemperature;
    }

    public Fridge(String vendor, String type, String name, int powerConsumption, int networkPowerSupply, double weight, String operatingMode, int coolingTemperature) {
        super(vendor, type, name, powerConsumption, networkPowerSupply, weight);
        this.operatingMode = operatingMode;
        this.coolingTemperature = coolingTemperature;
    }

    @Override
    public void turnOn() {
        System.out.println("Включить холодильник");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить холодильник");
    }

    public void cooling() {
        System.out.println("Охладить");
    }
}
