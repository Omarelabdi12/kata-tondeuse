package org.omarelabdi;

import org.junit.jupiter.api.Test;
import org.omarelabdi.mowitnow.Orientation;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrientationTest {

    @Test
    void pivote_a_gauche() {
        assertEquals(Orientation.W, Orientation.N.gauche());
        assertEquals(Orientation.S, Orientation.W.gauche());
        assertEquals(Orientation.E, Orientation.S.gauche());
        assertEquals(Orientation.N, Orientation.E.gauche());
    }

    @Test
    void pivote_a_droite() {
        assertEquals(Orientation.E, Orientation.N.droite());
        assertEquals(Orientation.S, Orientation.E.droite());
        assertEquals(Orientation.W, Orientation.S.droite());
        assertEquals(Orientation.N, Orientation.W.droite());
    }
}
