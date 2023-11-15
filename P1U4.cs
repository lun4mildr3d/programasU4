using System;

namespace MyCompany.BaseDeDatos
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] edades = new int[] { 19, 17, 19, 18, 17, };
            int[] edades = new int [] { 19, 17, 18, 18, 19 };

            for (int i = 0; i < edades.Length; i++)
            {
                 Console.WriteLine("indice: " + i + "es: " + edades[i]);
                 if (edades[i] >= 18)
                    Console.WriteLine("Eres Mayor");
                 else
                    Console.WriteLine("Eres Menor");
            }
        }
    }
