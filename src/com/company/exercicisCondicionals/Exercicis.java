package com.company.exercicisCondicionals;
import java.util.Scanner;

public class Exercicis {

    Scanner sc = new Scanner(System.in);

    public void ex1(){
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("EL número es positivo");
        }
        System.out.println("El número es negativo");
    }
    public void ex2(){
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        int resto = a%2;
        if (resto == 0){
            System.out.println("El número es múltiplo de 2");
        }
        System.out.println("El número no es par");
    }
    public void ex3(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b){
            System.out.println("El número " + b + " es mayor a " + a);
        }
        if (a == b){
            System.out.println("Los dos son iguales");
        }
        System.out.println("El número " + b + " es menor a " + a);
    }
    public void ex4(){
        int a = sc.nextInt();
        if (a > 0 && a <= 7) {
            switch (a) {
                case 1:
                    System.out.println("Es lunes");
                case 2:
                    System.out.println("Es martes");
                case 3:
                    System.out.println("Es miércoles");
                case 4:
                    System.out.println("Es jueves");
                case 5:
                    System.out.println("Es viernes");
                case 6:
                    System.out.println("Es sábado");
                case 7:
                    System.out.println("Es domingo");
            }
        }
    }
    public void ex5(){
        System.out.println("Qué hora es? (Escribe solo la hora)");
        int hora = sc.nextInt();
        if (hora > 0 && hora < 24) {
            if (hora >= 8 && hora <= 12) {
                System.out.println("Es por la mañana");
            }
            if (hora >= 12 && hora <= 17) {
                System.out.println("Es mediodía");
            }
            if (hora >= 17 && hora <= 20) {
                System.out.println("Es por la tarde");
            }
            if (hora >= 20 && hora <= 23) {
                System.out.println("Es de noche");
            }
            System.out.println("Es de madrugada");
        }
        System.out.println("Te has colao");
    }
    public void ex6(){
        System.out.println("Introduce la nota: ");
        int nota = sc.nextInt();
        if (nota >= 0 && nota <= 10){
            if (nota >= 0 && nota <= 4){
                System.out.println("Insuficiente");
            }
            if (nota == 5){
                System.out.println("Suficiente");
            }
            if (nota == 6){
                System.out.println("Bien");
            }
            if (nota == 7 || nota == 8){
                System.out.println("Notable");
            }
            if (nota == 9 || nota == 10){
                System.out.println("Sobresaliente");
            }
        }
    }
    public void ex7y8(){
        System.out.println("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.println("Introduce el año ");
        int año = sc.nextInt();

        if(dia > 0 && dia <= 30){
            if (mes > 0 && mes <= 12){
                if (año > 0 && año <= 2021){
                    System.out.println("La fecha es correcta.");
                }
            }
        }
        System.out.println("La fecha introducida no es correcta.");
    }
    public void ex9(){
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        System.out.println("Introduce un número: ");
        int b = sc.nextInt();
        System.out.println("Introduce un número: ");
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.print(a);
            if(b > c){
                System.out.println(" " + b + " " +  c);
            } else {
                System.out.println(" " + c + " " + b);
            }
        }
        if (b > a && b > c){
            System.out.print(b);
            if (a > c){
                System.out.println(" " + a + " " + c);
            } else {
                System.out.println(" " + c + " " + a);
            }
        }
        if (c > b && c > a){
            System.out.print(c);
            if (b > a){
                System.out.println(" " +  b + " " + a);
            } else {
                System.out.println(" " + a + " " + b);
            }
        }
    }
    public void ex10() {
        System.out.println("Introduce tu edad: ");
        int edat = sc.nextInt();

        if (edat > 0) {
            if (edat >= 18) {
                System.out.println("Eres mayor de edad");
            }
            System.out.println("Eres menor de edad");
        }
    }
}
