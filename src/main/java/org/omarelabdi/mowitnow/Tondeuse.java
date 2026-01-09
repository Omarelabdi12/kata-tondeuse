package org.omarelabdi.mowitnow;
// Gère la position, l’orientation et les déplacements d’une tondeuse.
public class Tondeuse {

    private int x;
    private int y;
    private Orientation orientation;

    public Tondeuse(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

/* Exécute les instructions dans l’ordre.
/ Si un déplacement sort de la pelouse, il est ignoré.*/

    public void executer(String instructions, Pelouse pelouse) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'G' -> orientation = orientation.gauche();
                case 'D' -> orientation = orientation.droite();
                case 'A' -> avancer(pelouse);
                default -> throw new IllegalArgumentException(
                        "Instruction invalide : " + instruction
                );
            }
        }
    }

// Avance d’une case selon l’orientation actuelle.
    private void avancer(Pelouse pelouse) {
        int nouveauX = x;
        int nouveauY = y;

        switch (orientation) {
            case N -> nouveauY++;
            case S -> nouveauY--;
            case E -> nouveauX++;
            case W -> nouveauX--;
        }

        if (pelouse.estDansLimites(nouveauX, nouveauY)) {
            x = nouveauX;
            y = nouveauY;
        }
    }

    public String position() {
        return x + " " + y + " " + orientation;
    }
}