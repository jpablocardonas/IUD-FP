/*
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja.

Si la bolita es blanca no se le hará descuento alguno,
si es verde se le hará un 10% de descuento,
si es amarilla un 25%,
si es azul un 50% y
si es roja un 100%.

Hacer un algoritmo para determinar la cantidad final que un cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores mencionados.
 */

import java.util.Scanner;

public class EjercicioRes4_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //OBTENIENDO DATOS DEL USUARIO
        System.out.println("Ingrese el valor total de la compra: ");
        double valor_bruto = entrada.nextDouble();

        System.out.println("Ingrese el color de la bolita: ");
        String color = entrada.next();

        double valor_neto;
        double descuento=0;

        switch (color) {
            case "blanco":
                descuento=0;
                break;
            case "verde":
                descuento=0.1;
                break;
            case "amarillo":
                descuento=0.25;
                break;
            case "azul":
                descuento=0.5;
                break;
            case "rojo":
                descuento=1;
                break;

        }

        valor_neto = valor_bruto*(1-descuento);

        System.out.println("El valor total a pagar será de $ " + valor_neto);
    }
}
