package Arreglos;

public class Matrices_For {
    public static void main(String[] args) {

        int[][] cantidades = {
                { 10, 20, 80 },
                { 50, 70, 60 },
                { 40, 30, 90 }
        };

        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: " + cantidades[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
