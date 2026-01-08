package org.omarelabdi;

import org.junit.jupiter.api.Test;
import org.omarelabdi.mowitnow.LecteurEntree;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    @Test
    void exemple_de_l_enonce() {
        List<String> lignes = List.of(
                "5 5",
                "1 2 N",
                "GAGAGAGAA",
                "3 3 E",
                "AADAADADDA"
        );

        LecteurEntree lecteur = new LecteurEntree();
        List<String> resultat = lecteur.executer(lignes);

        assertEquals(List.of("1 3 N", "5 1 E"), resultat);
    }
}
