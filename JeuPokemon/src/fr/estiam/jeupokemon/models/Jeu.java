package fr.estiam.jeupokemon.models;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jeu {
    List<String> joueurs = Arrays.asList("joueur1","joueur2");

    public void jouer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Joueur 1, tapez votre nom :");
        String nom1 = sc.next();
        System.out.println(nom1 + ", vous avez 100 poképièces, veuillez choisir avec 3 pokémons parmi :");


        System.out.println("Joueur 2, tapez votre nom :");
        String nom2 = sc.next();
        System.out.println(nom2 + ", vous avez 100 poképièces, veuillez choisir avec 3 pokémons parmi :");
    }
}
