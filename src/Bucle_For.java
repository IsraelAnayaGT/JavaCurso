public class Bucle_For {
    public static void main(String[] args) {
        // Bucle ascendente
       /* System.out.println("Bucle ascendente");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Vuelta No: " + i);
        }
        System.out.println("Fin del bucle for.");
        System.out.println(" ");

        // Bucle descendente
        System.out.println("Bucle descendente");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Vuelta No: " + i);
        }
        System.out.println(" ");
        System.out.println("Fin del bucle for."); */

        int suma = 0;
        System.out.println("Sumando valores...");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                System.out.println("Valor actual de i: " + i + " - Suma actual: " + suma);
            }
        }
        System.out.println("Fin del bucle for.");
        System.out.println("Suma de pares: " + suma);
    }
}
