/*
Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.
 */

import java.util.Scanner;

public class EjercicioRes4_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //OBTENIENDO DATOS DEL USUARIO
        System.out.println("Ingrese su número de inscripción: "); //Se asume como dato de tipo texto (string)
        String numero_inscripcion = entrada.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su patrimonio: ");
        double patrimnio = entrada.nextDouble();
        System.out.println("Ingrese su estrato social: "); //Se asume como dato de tipo entero
        int estrato_social = entrada.nextInt();

        double valor_matricula;

        if(patrimnio>2000000 && estrato_social>3){
            valor_matricula = 50000*(1+0.03);
        } else {
            valor_matricula = 50000;
        }

        System.out.println("Número de inscripción: "+numero_inscripcion+". Nombre: "+nombre+". El valor de su matrícula es: $" + valor_matricula);

    }
}
