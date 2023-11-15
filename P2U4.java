public class P2U4 {

    public static void main(String[] args) {
         int[] calificaciones = new int[] { 76, 78, 45, 68, 77, 95, 84, 46, 100, 100, };
 int suma = 0, promedio = 0;


 for (int i = 0; i < calificaciones.length; i++)
 {
   //  suma = suma + calificaciones[i];

     System.out.println("Calificacion: " + i + " es: " + calificaciones[i]);
     suma += calificaciones[i];


 }
promedio = suma / calificaciones.length;
 System.out.println("El promedio es: " + promedio);

    }
}