import java.util.Scanner;

/*
Ejercicio resuelto Nº 12
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.
 */
public class EjercicioRes4_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner((System.in));

        //OBTENIENDO LOS DATOS DEL USUARIO:
        System.out.println("Ingrese su nombre completo: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana: ");
        double horas_trabajadas_semana = entrada.nextDouble();
        System.out.println("Ingrese el valor de una hora normal de trabajo: ");
        double valor_hora = entrada.nextDouble();

        double pago;

        if(horas_trabajadas_semana<=40){
            pago=horas_trabajadas_semana*valor_hora;
        } else if (horas_trabajadas_semana>40 && horas_trabajadas_semana<=48) {
            pago = 40*valor_hora + (horas_trabajadas_semana-40)*2*valor_hora;
        }else{
            pago = 40*valor_hora + 8*2*valor_hora + (horas_trabajadas_semana-48)*3*valor_hora;
        }

        System.out.println("Su pago es de: $ " + pago);
    }
}
