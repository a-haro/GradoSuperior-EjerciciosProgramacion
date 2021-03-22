package com.company.exercicisBucles;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Bucles {

    Scanner sc = new Scanner(System.in);

    public void ex1(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        if (num >= 0){
            for (int i = 0; i < num + 1; i++){
                System.out.println(i);
            }
        }
    }
    public void ex2(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        while (num > 0){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
    }
    public void ex3(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        while (num != 0){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (num == 0){
                break;
            }
            if (num > 0){
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }
        }
    }
    public void ex4(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        while (num%2 != 0){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
    }
    public void ex5(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int counter = 0;

        while(num > 0){
            counter++;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println("Se han introducido " + counter + " números.");
    }
    public void ex6(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int total = 0;

        while (num != 0){
            total += num;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println("El total es " + total);
    }
    public void ex7(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        double total = 0;
        int counter = 0;
        while (num != 0){
            counter++;
            total += num;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        System.out.println("La media es: " + total/counter);
    }
    public void ex8(){
        System.out.println("Introduce un número: ");
        int a = sc.nextInt();
        int resultado = 1;

        for (int i = 0; i < a; i++){
            if (i % 2 != 0){
                resultado *= i;
            }
        }
        System.out.println("La multiplicación de los números impares es: " + resultado);
    }
    public void ex9(){
        int counter = 0;
        int numOcult = 3;
        System.out.println("Introduce un número: ");
        int numUsuari = sc.nextInt();
        while(numUsuari != numOcult){
            if(numUsuari > numOcult){
                System.out.println("El número introducido es mayor al oculto.");
            } else {
                System.out.println("El número introducido es menor al oculto.");
            }
            System.out.println("Introduce un número: ");
            numUsuari = sc.nextInt();
            counter++;
        }
        System.out.println("¡Has acertado!");
        System.out.println("Intentos: " + counter);
    }
}
