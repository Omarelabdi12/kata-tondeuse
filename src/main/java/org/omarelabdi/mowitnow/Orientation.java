package org.omarelabdi.mowitnow;
// Orientation actuelle de la tondeuse et logique de rotation gauche/droite.
public enum Orientation {
    N, E, S, W;

    public Orientation gauche() {
        return switch (this) {
            case N -> W;
            case W -> S;
            case S -> E;
            case E -> N;
        };
    }

    public Orientation droite() {
        return switch (this) {
            case N -> E;
            case E -> S;
            case S -> W;
            case W -> N;
        };
    }
}
