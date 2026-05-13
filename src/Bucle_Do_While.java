import java.util.Scanner;

public class Bucle_Do_While {
    public static void main(String[] args) {
        int contador = 1;
        final var valor = 5;
        Scanner entrada = new Scanner(System.in);

        //Bucle do while
       /* do {
            System.out.println("Valor: " + contador++);
    }while(contador <= valor);
        System.out.println("Fin del bucle do while");
    }*/

        //Ejercicio con bucle do while
        int numero = 0;
        int errores = 0;

        do {
            System.out.println("Ingrese un numero 5... ");
            numero = entrada.nextInt();
            if (numero != 5) {
                System.out.println("El numero ingresado no es 5, intente de nuevo...");
                errores++;
            }
        } while (numero != 5);
        System.out.println("Felicidades, ingresaste el numero correcto!"+ "\nNumero de errores cometidos: " + errores);
    }
}
