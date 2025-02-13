import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
        */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        double edad_juan = entrada.nextDouble();
        double edad_alberto = (edad_juan*2)/3;
        double edad_ana = (edad_juan*4)/3;
        double edad_mama = edad_juan + edad_alberto + edad_ana;

        System.out.println("La edad de Juan es: " + edad_juan + " La edad de Alberto es: " + edad_alberto + " La edad de Ana es: " + edad_ana + " La edad de la mamá es: " + edad_mama);
    }
}
