import java.util.Scanner;

public class Oper_Aritmeticos {
    static void main() {
        int valor1, valor2, resultado;

        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrse valor 1...");
        valor1 = entrada.nextInt();
        System.out.println("Ingrse valor 2...");
        valor2 = entrada.nextInt();

        //Operacion Suma
        resultado = valor1 + valor2;
        System.out.println("El resultado de la suma es: " + resultado);

        //Operacion Resta
        resultado = valor1 - valor2;
        System.out.println("El resultado de la resta es: " + resultado);

        //Operacion Multiplicacion
        resultado = valor1 * valor2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);

        //Operacion Division
        resultado = valor1 / valor2;
        System.out.println("El resultado de la division es: " + resultado);

        //Operacion residuo
        resultado = valor1 % valor2;
        System.out.println("El resultado del residuo es: " + resultado);

    }
}
