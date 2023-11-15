using System;

class Program
{
    static void Main()
    {
        int[] datos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        var clasificacion = Clasificar(datos);

        Console.WriteLine("Numeros pares:");
        Arreglo(clasificacion.pares);

        Console.WriteLine("Numeros impares:");
        Arreglo(clasificacion.impares);
    }
    static (int[] pares, int[] impares) Clasificar(int[] arreglo)
    {
        int[] pares = Array.FindAll(arreglo, elemento => elemento % 2 == 0);
        int[] impares = Array.FindAll(arreglo, elemento => elemento % 2 != 0);

        return (pares, impares);
    }

    static void Arreglo(int[] arreglo)
    {
        foreach (var elemento in arreglo)
        {
            Console.Write(elemento + " ");
        }
        Console.WriteLine();
    }
}