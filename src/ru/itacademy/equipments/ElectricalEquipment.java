package ru.itacademy.equipments;

public abstract class ElectricalEquipment {
    String vendor;
    String type;
    String name;
    int powerConsumption;
    int networkPowerSupply;
    double weight;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNetworkPowerSupply() {
        return networkPowerSupply;
    }

    public void setNetworkPowerSupply(int networkPowerSupply) {
        this.networkPowerSupply = networkPowerSupply;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ElectricalEquipment(String vendor, String type, String name, int powerConsumption, int networkPowerSupply, double weight) {
        this.vendor = vendor;
        this.type = type;
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.networkPowerSupply = networkPowerSupply;
        this.weight = weight;
    }

    public abstract void turnOn();

    public abstract void turnOff();

}
