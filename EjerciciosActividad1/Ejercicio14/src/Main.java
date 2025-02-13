/*
Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su cuadrado y su cubo: ");
        double numero = entrada.nextDouble();
        double cuadrado = Math.pow(numero,2);
        double cubo = Math.pow(numero,3);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado + ". Y su cubo es: " + cubo);

    }
}
