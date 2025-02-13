/*
19. Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
    perímetro, el valor de la altura y el área del triángulo.

*/
import java.util.Scanner;
public class Ejercicio3_19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //OBTENIENDO LOS DATOS DEL USUARIO
        System.out.println("Ingrese el valor de un lado del triángulo rectángulo: ");
        double lado = entrada.nextDouble();

        //CALCULANDO LOS DATOS DE SALIDA
        double perimetro = 3*lado;
        double altura = (Math.sqrt(3)/2) * lado;
        double area = 0.5 * lado * altura;

        //MOSTRANDO LOS RESULTADOS
        System.out.println("El perímetro del triángulo es: " + perimetro + " unidades. La altura del triángulo es: " + altura + "unidades. El área del triángulo es: " + area + " unidades cuadradas.");
    }
}
