import java.util.Scanner;

/*
Ejercicio resuelto Nº 11
Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos.
 */
public class EjercicioRes4_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su primer número: ");
        double primer_numero = entrada.nextDouble();
        System.out.println("Ingrese su segundo número: ");
        double segundo_numero = entrada.nextDouble();
        System.out.println("Ingrese su tercer número: ");
        double tercer_numero = entrada.nextDouble();

        if(primer_numero>segundo_numero && primer_numero>tercer_numero){
            System.out.println("El número " + primer_numero + " es el mayor");
        } else if(segundo_numero>primer_numero && segundo_numero>tercer_numero){
            System.out.println("El número" + segundo_numero + " es el mayor");
        } else {
            System.out.println("El número " + tercer_numero + " es el mayor");
        }
    }
}
