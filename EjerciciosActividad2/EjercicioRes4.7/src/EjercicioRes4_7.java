import java.util.Scanner;

/*
Ejercicio resuelto Nº 7
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.
 */
public class EjercicioRes4_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //OBTENIENDO DATOS DEL USUARIO
        System.out.println("Escriba el primer número: ");
        double a = entrada.nextDouble();
        System.out.println("Escriba el segundo número: ");
        double b = entrada.nextDouble();

        if (a>b) {
            System.out.println("El número " + a + " es mayor que " + b + ".");
        } else if (a<b) {
            System.out.println("El número " + a + " es menor que " + b + ".");
        } else {
            System.out.println("Los dos números son iguales");
        }
    }
}
