package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un Número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("El número introducido es PAR.");
        } else {
            System.out.println("El número introducido es IMPAR.");
        }

        sc.close();
    }
}
