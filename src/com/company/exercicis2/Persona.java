package com.company.exercicis2;

public class Persona {
    private String nom;
    private int edat;
    private int dni;
    private String sexe;
    private int telefon;
    //método constructor

    public Persona(String nom, int edat, int dni, String sexe, int telefon){
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
        this.sexe = sexe;
        this.telefon = telefon;
    }
    //setters
    public void setNom(String nom) {this.nom = nom;}
    public void setEdat(int edat) {this.edat = edat;}
    public void setDni(int dni) {this.dni = dni;}
    public void setSexe(String sexe) {this.sexe = sexe;}
    public void setTelefon(int telefon) {this.telefon = telefon;}

    //getters
    public String getNom() {return nom;}
    public int getEdat() {return edat;}
    public int getDni() {return dni;}
    public String getSexe() {return sexe;}
    public int getTelefon() {return telefon;}

    public void display(){
        System.out.println(nom + " " + edat + " " +  dni + " " + sexe + " " +  telefon);
    }
}
