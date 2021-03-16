package com.company.exercicis3;

public class Dog {

    private String nom;
    private int edat;
    private String raça;
    private int numVacc;
    private boolean pedigri;

    public Dog(String nom, int edat, String raça, int numVacc, boolean pedigri){
         this.nom = nom;
         this.edat = edat;
         this.raça = raça;
         this.numVacc = numVacc;
         this.pedigri = pedigri;
    }

    public String getNom() {return nom;}
    public int getEdat(){return edat;}
    public String getRaça(){return raça;}
    public int getNumVacc(){return numVacc;}
    public boolean getPedigri(){return pedigri;}

    public void setNom(String nom) {this.nom = nom;}
    public void setEdat(int edat) {this.edat = edat;}
    public void setRaça(String raça) {this.raça = raça;}
    public void setNumVacc(int numVacc) {this.numVacc = numVacc;}
    public void setPedigri(boolean pedigri) {this.pedigri = pedigri;}

    public void display(){
        System.out.println(this.nom);
        System.out.println(this.edat);
        System.out.println(this.raça);
        System.out.println(this.numVacc);
        System.out.println(this.pedigri);
    }

    public void novaVaccuna(){
        this.numVacc++;
    }
}
