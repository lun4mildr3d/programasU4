using System;

class Program
{
    static void Main()
    {
        Console.Write("Ingrese las temperaturas: ");
        int totalT = int.Parse(Console.ReadLine());

        double[] Ce = new double[totalT];
        double[] Fa = new double[totalT];
        double[] Ke = new double[totalT];

        for (int c = 0; c < totalT; c++)
        {
            Console.Write($"Ingrese la temperatura en °C {c + 1}: ");
            Ce[c] = double.Parse(Console.ReadLine());

            Fa[c] = (Ce[c] * 9 / 5) + 32;
            Ke[c] = Ce[c] + 273.15;
        }

        Console.WriteLine("Resultados:");
        for (int c = 0; c < totalT; c++)
        {
            Console.WriteLine($"Temperatura {c + 1} - {Ce[c]:F2}°C = {Fa[c]:F2}°F = {Ke[c]:F2}°K");
        }
    }
}