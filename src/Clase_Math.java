import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese valor a calcular...");
        int valor = entrada.nextInt();

        //Calculo de raiz cuadrada
        System.out.println("Raiz cuadrada de " + valor + " = " + Math.sqrt(valor));

        //Calculo de potencia
        var base = 2;
        var exponente = 3;
        System.out.println("Potencia de la 2 a la 3 = " + Math.pow(base, exponente));
        
        //Valor absoluto de un numero
        var absoluto = 2.5;
        System.out.println("Valor absoluto de " + absoluto + " = " + Math.abs(absoluto));

        //Identificar mayor valor
        var numero1 = 50.2;
        var numero2 = 3;
        System.out.println("Mayor valor: "+ Math.max(numero1, numero2));
        System.out.println("Menor valor: "+ Math.min(numero1, numero2));
        
        //Redondeo a entero mas cercano
        var total = 5.2826;
        System.out.println(total + "Valor redondeado: " + Math.round(total));

        //Redondear hacia abajo 
        System.out.println(total + "Valor redondeado hacia abajo: " + Math.floor(total));

        //Redondear hacia arriba a entero mas cercano
        System.out.println(total + "Valor redondeado hacia arriba: " + Math.ceil(total));

        //Numero aleatorio
        double aleatorio = Math.round(Math.random() * 10);
        System.out.println("Numero aleatorio: " + aleatorio);

        //Funcion numero PI
        System.out.println("Valor de PI: " + Math.PI);

        //Seno de un angulo
        System.out.println("Seno de un angulo de 90:" + Math.sin(90));

        //Coseno de un angulo
        System.out.println("Coseno de un angulo de 180:" + Math.cos(180));

        //Logaritmo natural de un numero
        var log = 100;
        System.out.println("Logaritmo natural de " + log + " = " + Math.log(log));

        //Logaritmo base 10 de un numero
        System.out.println("Logaritmo base 10 de " + log + " = " + Math.log10(log));
    }
}
