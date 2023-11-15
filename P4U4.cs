using System;

class Program
{
    static void Main()
    {
        
        int[] numeros = { 2, -2, 10, -3, 3, -1, 8 };

       
        int totalN = ContarN(numeros);

        
        Console.WriteLine("Los números negativos son: {totalN}");
    }

    static int ContarN(int[] array)
    {
        int contador = 0;

        
        foreach (int numero in array)
        {
            if (numero < 0)
            {
                contador++;
            }
        }

        return contador;
    }
}