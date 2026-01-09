package org.omarelabdi.mowitnow;
// Représente la pelouse et ses limites.
public class Pelouse {

    private final int maxX;
    private final int maxY;

    public Pelouse(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }
// Vérifie si une position reste dans la pelouse.
    public boolean estDansLimites(int x, int y) {
        return x >= 0 && y >= 0 && x <= maxX && y <= maxY;
    }
}

