package com.mycompany.p5u4;

public class P5u4 {

    public static void main(String[] args) {
        String[] frutas = {"fres", "Mango", "uvas", "manzana", "melon","sandia"};


        String[] frutasAlReves = new String[frutas.length];


        for (int i = 0; i < frutas.length; i++) {
            frutasAlReves[i] = frutas[frutas.length - 1 - i];
        }


        System.out.println("Arreglo Original:");
        imprimirArreglo(frutas);


        System.out.println("\nArreglo al Revés:");
        imprimirArreglo(frutasAlReves);
    }


    static void imprimirArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.print(elemento + " ");
        }

    }
}    