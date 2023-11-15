package com.mycompany.P7U4;

import java.util.Arrays;

public class P7U4 {
    public static void main(String[] args) {
        double[] numeros = { 3, 7, 1, 3, 2, 1, 6 };

        double media = M(numeros);
        System.out.println("La media es: " + media);

        double mediana = Me(numeros);
        System.out.println("La mediana es: " + mediana);
    }

    static double M(double[] array) {
        double suma = 0;

        for (double numero : array) {
            suma += numero;
        }

        return suma / array.length;
    }

    static double Me(double[] array) {
        Arrays.sort(array);

        int n = array.length;

        if (n % 2 == 0) {
            double elemento1 = array[(n / 2) - 1];
            double elemento2 = array[n / 2];
            return (elemento1 + elemento2) / 2;
        } else {
            return array[n / 2];
        }
    }
}