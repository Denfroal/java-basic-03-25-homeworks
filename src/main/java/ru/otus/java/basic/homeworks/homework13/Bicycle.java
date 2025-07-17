package ru.otus.java.basic.homeworks.homework13;

public class Bicycle extends Vehicle{

    public Bicycle() {
        this.setVehicleName("Велосипед");
    }
    @Override
    public boolean move(TerrainType terrainType, int distance) {
        if (terrainType != TerrainType.swamp) {
            return super.move(terrainType, distance);
        } else {
            System.out.println("По типу местности " + terrainType.getTerrainName() + " " + getVehicleName() + " не проедет");
            return false;
        }
    }
}
