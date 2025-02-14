import java.util.Scanner;

/*
Ejercicio resuelto Nº 14
Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
• Ventas del departamento 1
• Ventas del departamento 2
• Ventas del departamento 3
• Salario de los vendedores de cada departamento
Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
al finalizar el período.
 */
public class EjecicioRes4_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //CAPTURANDO DATOS DEL USUARIO
        System.out.println("Ingrese las ventas del departamento 1: ");
        double ventas1 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        double ventas2 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        double ventas3 = entrada.nextDouble();
        System.out.println("Ingrese el salario de cada vendedor: ");
        double salario = entrada.nextDouble();

        double salario1=0;
        double salario2=0;
        double salario3=0;

        double importe_total_ventas = ventas1+ventas2+ventas3;
        System.out.println(importe_total_ventas);
        double porcentaje1 = 100*ventas1/importe_total_ventas;
        double porcentaje2 = 100*ventas2/importe_total_ventas;
        double porcentaje3 = 100*ventas3/importe_total_ventas;
        System.out.println(porcentaje1);

        if (porcentaje1>33){
            salario1=salario*1.2;
        }else{
            salario1=salario;
        }
        if (porcentaje2>33) {
            salario2=salario*1.2;
        }else{
            salario2=salario;
        }
        if (porcentaje3>33) {
            salario3=salario*1.2;
        }else{
            salario3=salario;
        }

        System.out.println("El salario de los vendedores del departamento 1 es $ " + salario1);
        System.out.println("El salario de los vendedores del departamento 2 es $ " + salario2);
        System.out.println("El salario de los vendedores del departamento 3 es $ " + salario3);

    }
}
