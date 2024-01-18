package fr.estiam.jeupokemon.models;

import java.awt.*;

public class Pokemon {
    private String nom;
    private Float prix;
    private String type1;
    private String type2;
    private int PV;
    private int level;
    private int attaque;
    private int attaqueSpeciale;
    private int defense;
    private int defenseSpeciale;
    private int vitesse;
    private List attaques;
    public Pokemon (String nom, Float prix, String type1, String type2, int PV, int level, int attaque, int attaqueSpeciale, int defense, int defenseSpeciale, int vitesse, List attaques){
        this.nom = nom;
        this.prix = prix;
        this.type1 = type1;
        this.type2 = type2;
        this.PV = PV;
        this.level = level;
        this.attaque = attaque;
        this.attaqueSpeciale = attaqueSpeciale;
        this.defense = defense;
        this.defenseSpeciale=defenseSpeciale;
        this.vitesse = vitesse;
        this.attaques = attaques;

    }
}
