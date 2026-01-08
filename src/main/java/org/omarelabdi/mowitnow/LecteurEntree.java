package org.omarelabdi.mowitnow;

import java.util.ArrayList;
import java.util.List;

public class LecteurEntree {

    public List<String> executer(List<String> lignes) {
        List<String> propres = lignes.stream()
                .map(String::trim)
                .filter(l -> !l.isEmpty())
                .toList();

        Pelouse pelouse = creerPelouse(propres.get(0));
        List<String> resultats = new ArrayList<>();

        for (int i = 1; i < propres.size(); i += 2) {
            Tondeuse tondeuse = creerTondeuse(propres.get(i));
            String instructions = propres.get(i + 1);

            tondeuse.executer(instructions, pelouse);
            resultats.add(tondeuse.position());
        }

        return resultats;
    }

    private Pelouse creerPelouse(String ligne) {
        String[] parties = ligne.split(" ");
        return new Pelouse(
                Integer.parseInt(parties[0]),
                Integer.parseInt(parties[1])
        );
    }

    private Tondeuse creerTondeuse(String ligne) {
        String[] parties = ligne.split(" ");
        int x = Integer.parseInt(parties[0]);
        int y = Integer.parseInt(parties[1]);
        Orientation orientation = Orientation.valueOf(parties[2]);
        return new Tondeuse(x, y, orientation);
    }
}

