import java.util.Scanner;

public class Arreglos_mayor_valor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;

        // Llenando array
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        if (numeros[0] > mayor) {
            mayor = numeros[0];
        }

        System.out.println("El mayor valor es: " + mayor);
    }

}
