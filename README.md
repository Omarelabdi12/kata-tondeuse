# KATA TONDEUSE – JAVA

# Description
Programme Java simulant une tondeuse automatique sur une pelouse rectangulaire.
Les tondeuses exécutent des instructions (G, D, A) de façon séquentielle.
Les données sont lues depuis un fichier texte.

# Fichier d’entrée

Le fichier d’entrée est placé dans :
src/main/resources/Filetest.txt

# Format :
- 1ère ligne : taille de la pelouse (maxX maxY)
- Puis, pour chaque tondeuse :
  - position initiale : x y orientation (N, E, S, W)
  - instructions : suite de caractères (G, D, A)

Exemple :
5 5
1 2 N
GAGAGAGAA
3 3 E
AADAADADDA

Lancer les tests
----------------
mvn test

# Lancer le programme

Depuis IntelliJ :
- Ouvrir la classe Main
- Cliquer sur Run

Le programme lit automatiquement le fichier Filetest.txt
et affiche les positions finales dans la console.

# Modifier l’entrée

Pour tester un autre cas, modifier simplement le fichier :
src/main/resources/Filetest.txt
