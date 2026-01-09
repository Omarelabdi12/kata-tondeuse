package org.omarelabdi.mowitnow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    // Le fichier d’entrée est passé en argument.
    public static void main(String[] args) throws Exception {

        InputStream inputStream = Main.class
                .getClassLoader()
                .getResourceAsStream("Filetest.txt");

        if (inputStream == null) {
            throw new IllegalStateException("Fichier introuvable dans resources");
        }

        List<String> lignes = new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .toList();

        LecteurEntree lecteur = new LecteurEntree();
        lecteur.executer(lignes).forEach(System.out::println);
    }
}