package ru.otus.java.basic.homeworks.homework13;

public class Vehicle {
    private String vehicleName;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public boolean move(TerrainType terrainType, int distance) {
        System.out.println("Проехали расстояние " + distance + " метров на транспорте " + vehicleName + " по местности " + terrainType.getTerrainName());
        return true;
    }
}
