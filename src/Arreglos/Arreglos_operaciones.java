public class Arreglos_operaciones {
    public static void main(String[] args) {
        int ventas1[] = { 500, 600, 400, 100, 650 };
        int ventas2[] = { 600, 800, 500, 350, 900 };
        int total[] = new int[ventas1.length];
        int totalVentas = 0;

        System.out.println(" ");
        System.out.println("Suma de valores");
        ;

        for (int i = 0; i < ventas1.length; i++) {
            int suma = ventas1[i] + ventas2[i];
            total[i] = suma;
            totalVentas = totalVentas + total[i];
            System.out.println("Suma de ventas " + (i + 1) + ": " + suma);
        }
        System.out.println("Total de ventas: " + totalVentas);

        System.out.println(" ");
        System.out.println("Resta de valores");
        ;

        for (int i = 0; i < ventas1.length; i++) {
            int resta = ventas2[i] - ventas1[i];
            total[i] = resta;
            totalVentas = totalVentas + total[i];
            System.out.println("Resta de ventas " + (i + 1) + ": " + resta);
        }
        System.out.println(" ");
        System.out.println("Multiplicación de valores");
        ;

        for (int i = 0; i < ventas1.length; i++) {
            int multiplicacion = ventas1[i] * ventas2[i];
            total[i] = multiplicacion;
            totalVentas = totalVentas + total[i];
            System.out.println("Multiplicación de ventas " + (i + 1) + ": " + multiplicacion);
        }

        System.out.println(" ");
    }
}
