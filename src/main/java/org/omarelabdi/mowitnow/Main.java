package org.omarelabdi.mowitnow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage : java Main <fichier_entree>");
            System.exit(1);
        }

        List<String> lignes = Files.readAllLines(Path.of(args[0]));

        LecteurEntree lecteur = new LecteurEntree();
        List<String> resultats = lecteur.executer(lignes);

        resultats.forEach(System.out::println);
    }
}