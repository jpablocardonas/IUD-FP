import java.util.Scanner;

/*
21. Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
        semiperímetro y el área del triángulo.
 */
public class Ejercicio3_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //OBTENIENDO LOS DATOS DEL USUARIO
        System.out.println("Ingrese el valor del primer lado del triángulo: ");
        double primer_lado = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo lado del triángulo: ");
        double segundo_lado = entrada.nextDouble();
        System.out.println("Ingrese el valor del tercer lado del triángulo: ");
        double tercer_lado = entrada.nextDouble();

        //CALCULANDO LOS DATOS DE SALIDA
        double perimetro = primer_lado+segundo_lado+tercer_lado;
        double semi_perimetro = perimetro/2;
        double area = Math.sqrt(semi_perimetro*(semi_perimetro-primer_lado)*(semi_perimetro-segundo_lado)*(semi_perimetro-tercer_lado));//USANDO FÓRMULA DE HERÓN

        //MOSTRANDO LOS RESULTADOS
        System.out.println("El perímetro del triángulo es: " + perimetro + " unidades. El semiperímetro del triángulo es: " + semi_perimetro + "unidades. El área del triángulo es: " + area + " unidades cuadradas.");
    }
}
