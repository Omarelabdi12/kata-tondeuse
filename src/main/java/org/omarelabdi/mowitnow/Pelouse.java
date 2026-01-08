package org.omarelabdi.mowitnow;

public class Pelouse {

    private final int maxX;
    private final int maxY;

    public Pelouse(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean estDansLimites(int x, int y) {
        return x >= 0 && y >= 0 && x <= maxX && y <= maxY;
    }
}

