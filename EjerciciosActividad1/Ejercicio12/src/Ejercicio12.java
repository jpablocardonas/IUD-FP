import java.util.Scanner;

/*
Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        //DATOS
        //Horas trabajadas a la semana:
        final double horas_semana = 48;
        //Valor hora:
        final double valor_hora = 5000;
        //% de retención en la fuente:
        final double retencion_fuente = 0.125;

        //Cálculo del salario bruto MENSUAL del trabajador:
        double salario_bruto = horas_semana*valor_hora*4;
        //Cálculo de la retención en la fuente:
        double valor_retencion_fuente = salario_bruto * retencion_fuente;
        //Cálculo del salario neto del trabajador:
        double salario_neto = salario_bruto * (1-retencion_fuente);

        System.out.println("El salario buuto mensual del trabajador es: " + salario_bruto + ". La retención en la fuente es de $ " + valor_retencion_fuente + ". Por lo tanto, el salario neto del trabajador es de : $ " + salario_neto + ".");
    }
}
