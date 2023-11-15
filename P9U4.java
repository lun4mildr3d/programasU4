package com.mycompany.P9U4;

public class P9U4 {
    public static void main(String[] args) {
        String[] nombres = { "Luna", "Ishai", "Ricardo", "Mildred" };
        String[] apellidos = { "Paez", "Juarez", "Ruiz", "Vega" };

        String[] nombres_Completos = nombres_Apellidos(nombres, apellidos);

        System.out.println("Nombres completos:");
        imprimir_Arreglo(nombres_Completos);
    }

    static String[] nombres_Apellidos(String[] nombres, String[] apellidos) {
        String[] nombres_Completos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nombres_Completos[i] = nombres[i] + " " + apellidos[i];
        }

        return nombres_Completos;
    }

    static void imprimir_Arreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}