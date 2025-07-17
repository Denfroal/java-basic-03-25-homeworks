package ru.otus.java.basic.homeworks.homework13;

public enum TerrainType {
    denseForest ("густой лес"),
    plain ("равнина"),
    swamp ("болото");

    private String terrainName;

    public String getTerrainName() {
        return terrainName;
    }

    private TerrainType(String terrainName) {
        this.terrainName = terrainName;
    }
}
