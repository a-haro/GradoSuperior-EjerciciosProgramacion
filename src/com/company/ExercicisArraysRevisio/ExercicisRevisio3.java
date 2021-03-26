package com.company.ExercicisArraysRevisio;
import java.util.Scanner;

public class ExercicisRevisio3 {

    private static Scanner sc = new Scanner(System.in);


    public static void ex1(){
        System.out.print("¿Cuántos números introducirá?: ");
        int numNums = sc.nextInt();
        int nums[];
        nums = new int[numNums];
        int aux;
        for (int i = 0; i < numNums; i++){
            System.out.print("Introduce un número: ");
            nums[i] = sc.nextInt();
        }
        for (int i=0; i<nums.length/2; i++) {
            aux = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = aux;
        }
        String cadena = "Array invertida: ";
        for (int i = 0; i < nums.length; i++) {
            cadena += nums[i] + ", ";
        }
        cadena = cadena.substring(0, cadena.length()-2);
        System.out.println(cadena);
    }
    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números introducirá?: ");
        int numNums = sc.nextInt();
        int nums[];
        nums = new int[numNums];
        int aux = 0;
        for (int i = 0; i < numNums; i++){
            System.out.print("Introduce un número: ");
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < numNums; i++){
            aux = nums[i];
        }
        System.out.println("La media es: " + aux/numNums);
    }

}
