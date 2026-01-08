package org.omarelabdi;

import org.junit.jupiter.api.Test;
import org.omarelabdi.mowitnow.Orientation;
import org.omarelabdi.mowitnow.Pelouse;
import org.omarelabdi.mowitnow.Tondeuse;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TondeuseTest {

    @Test
    void avance_vers_le_nord() {
        Pelouse pelouse = new Pelouse(5, 5);
        Tondeuse tondeuse = new Tondeuse(1, 2, Orientation.N);

        tondeuse.executer("A", pelouse);

        assertEquals("1 3 N", tondeuse.position());
    }

    @Test
    void n_avance_pas_en_dehors_de_la_pelouse() {
        Pelouse pelouse = new Pelouse(5, 5);
        Tondeuse tondeuse = new Tondeuse(5, 5, Orientation.N);

        tondeuse.executer("A", pelouse);

        assertEquals("5 5 N", tondeuse.position());
    }

    @Test
    void execute_une_sequence_complete() {
        Pelouse pelouse = new Pelouse(5, 5);
        Tondeuse tondeuse = new Tondeuse(1, 2, Orientation.N);

        tondeuse.executer("GAGAGAGAA", pelouse);

        assertEquals("1 3 N", tondeuse.position());
    }
}