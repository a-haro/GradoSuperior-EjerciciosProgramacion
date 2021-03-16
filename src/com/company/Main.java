package com.company;
import com.company.exercicis2.Persona;
import com.company.exercicisBucles.Bucles;
import com.company.exercicisCondicionals.Exercicis;

public class Main {

    public static void main(String[] args) {
        Bucles bucles = new Bucles();
        bucles.ex8();
    }
    public static void crearPersona(Persona persona){
        Persona persona1 = new Persona("Antonio", 12, 13423222, "Varón", 655999442);
        persona1.display();
    }
    /*public static void crearPersonaPerTeclat(Persona persona){
        Scanner sc = new Scanner(System.in);
        Persona persona2 = new Persona();
        System.out.println("Name: ");
        persona2.setNom(sc.nextLine());
        System.out.println("Years: ");
        persona2.setEdat(sc.nextInt());
        System.out.println("DNI: ");
        persona2.setDni(sc.nextInt());
        System.out.println("Sex: ");
        persona2.setSexe(sc.nextLine());
        System.out.println("Phone nº: ");
        persona2.setTelefon(sc.nextInt());
        persona2.display();
    }*/

}
