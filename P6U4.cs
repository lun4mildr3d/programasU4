using System;

class Program
{
    static void Main()
    {
        
        int[] numeros = { 13, 3, 21, 22, 54, 2 };

        
        Ordenar_Arreglo(numeros);

        Console.WriteLine("Arreglo Ordenado:");
        Imprimir_Arreglo(numeros);
    }

    static void Ordenar_Arreglo(int[] array)
    {
        int[] auxiliar = new int[array.Length];
        Orden_Por_Insercion(array, auxiliar);
    }

    static void Orden_Por_Insercion(int[] array, int[] auxiliar)
    {
        for (int i = 1; i < array.Length; i++)
        {
            int elementoActual = array[i];
            int j = i - 1;


            while (j >= 0 && auxiliar[j] > elementoActual)
            {
                auxiliar[j + 1] = auxiliar[j];
                j--;
            }

            auxiliar[j + 1] = elementoActual;
        }

        Array.Copy(auxiliar, array, array.Length);
    }

    static void Imprimir_Arreglo(int[] array)
    {
        foreach (int elemento in array)
        {
            Console.Write("{Elemento} ");
        }
        Console.WriteLine();
    }
}