import java.util.Scanner;

/*Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia.*/
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Obteniendo el valor del radio:
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        //Cálculo del área y de la longitud:
        double area = Math.PI * Math.pow(radio,2);
        double longitud = 2*Math.PI*radio;

        //Mostrando los resultados:
        System.out.println("El área de la circunferencia es: " + area + " y su longitud es: " + longitud);
    }
}
