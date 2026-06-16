public class Arreglos_enteros {
    public static void main(String[] args) {
        //Declaración de un array
        //int numeros[];

        //Creacion de un array
        int[] numeros = new int[5];

        //inicializar una array forma 1
        numeros[0] = 15;
        numeros[1] = 27;
        numeros[2] = 37;
        numeros[3] = 46;
        numeros[4] = 54;

        //Asignar los valores del array a variables individuales
        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        int e = numeros[4];

        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de d es: " + d);
        System.out.println("El valor de e es: " + e);

        //inicializar un array forma 2
        int[] valores = {154, 274, 372, 464, 542};

        //Consultar un array
        System.out.println("El valor en la posición 0 es: " + numeros[0]);
        System.out.println("El valor en la posición 1 es: " + valores[1]);
    }
}