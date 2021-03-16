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
}
