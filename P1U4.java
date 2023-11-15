package com.mycompany.P1U4;

public class P1U4 {

    public static void main(String[] args) {
        int[] edades = { 17, 19, 18, 17, 18 };
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("indice: " + i + " es: " + edades[i]);
            
            if (edades[i] >= 18)
                System.out.println("Eres Mayor");
            else
                System.out.println("Eres Menor");
        }
    }
}