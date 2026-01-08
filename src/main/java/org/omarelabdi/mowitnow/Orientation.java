package org.omarelabdi.mowitnow;

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
