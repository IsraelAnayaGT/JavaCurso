package Arreglos;

public class Matrices {
    public static void main(String[] args){
        int [][] numeros = new int[3][3];

        //llenado fila 1 de la matriz
        numeros[0][0] = 8;
        numeros[0][1] = 7;
        numeros[0][2] = 6;

        //llenado fila 2 de la matriz
        numeros[1][0] = 5;
        numeros[1][1] = 4;
        numeros[1][2] = 3;

        //llenado fila 3 de la matriz
        numeros[2][0] = 2;      
        numeros[2][1] = 1;
        numeros[2][2] = 0;

        System.out.println("Posición [0][0]: "+ numeros[0][0]);
        System.out.println("Posición [0][1]: "+ numeros[0][1]);
        System.out.println("Posición [0][2]: "+ numeros[0][2]);
        System.out.println("Posición [1][0]: "+ numeros[1][0]);
        System.out.println("Posición [1][1]: "+ numeros[1][1]);
        System.out.println("Posición [1][2]: "+ numeros[1][2]);
        System.out.println("Posición [2][0]: "+ numeros[2][0]);
        System.out.println("Posición [2][1]: "+ numeros[2][1]);
        System.out.println("Posición [2][2]: "+ numeros[2][2]);
    }
}