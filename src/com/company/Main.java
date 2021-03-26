package com.company;
import com.company.ExercicisArraysRevisio.ExercicisRevisio3;
import com.company.exercicis2.Persona;
import com.company.exercicisBucles.Bucles;

public class Main {

    public static void main(String[] args) {
        Bucles bucles = new Bucles();
        ExercicisRevisio3.ex2();
    }
    public static void crearPersona(Persona persona){
        Persona persona1 = new Persona("Antonio", 12, 13423222, "Varón", 655999442);
        persona1.display();
    }


}
