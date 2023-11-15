package com.mycompany.P4U4;

import java.util.Scanner;

public class P4U4 {

      Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        double N = 0;
        int tam;

        System.out.println("Ingresa la cantidad de numeros a procesar:");
        tam = sc=nextInt();

        int[] Numeros = new int[tam];

       for (int i = 0; i < Numeros.length; i++)
{
    System.out.println("Ingrese un numero: " + i + " :");
    N = sc=nextInt();
    if (N < 0)
    {
        i++;
    }

}

System.out.println("Los Números negativos son: " +N);

    }
}