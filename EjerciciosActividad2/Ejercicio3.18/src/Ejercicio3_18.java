/*
18. Se tiene la siguiente información de un empleado:
        · código del empleado,
        · nombres,
        · número de horas trabajadas al mes,
        · valor hora trabajada,
        · porcentaje de retención en la fuente.
        Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto.
*/

import java.util.Scanner;

//SE ASUME QUE EL CÓDIGO DEL EMPLEADO ES UN DATO DE TIPO TEXTO
public class Ejercicio3_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //CAPTURANDO DATOS DEL USUARIO
        System.out.println("Ingrese su código de empleado: ");
        String codigo = entrada.nextLine();
        System.out.println("Ingrese su primer nombre: ");
        String primer_nombre = entrada.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        String segundo_nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas al mes: ");
        double horas_trabajadas_mes = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora trabajada: ");
        double valor_hora_trabajada = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        double porcentaje_retencion_fuente = entrada.nextDouble();

        System.out.println("---------------------------------");

        //CALCULANDO DATOS DE SALIDA
        double salario_bruto = horas_trabajadas_mes*valor_hora_trabajada;
        double salario_neto = salario_bruto * (100-porcentaje_retencion_fuente)/100;

        //MOSTRANDO LOS DATOS SOLICITADOS
        System.out.println(
                "Código: " + codigo + ". Nombres: " + primer_nombre + " " + segundo_nombre + ". Su salario bruto es: $" + salario_bruto + ". Su salario neto es: $" + salario_neto
        );
    }
}
