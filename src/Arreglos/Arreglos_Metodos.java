import java.util.Arrays;

public class Arreglos_Metodos {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5, 6,7,8};
        int[] numerosDesordenados = {5, 2, 8, 1, 4, 7, 6, 3};
        String[] letras = {"b", "t", "a", "y", "c"};

        //Ver valores como texto
        System.out.println("Array original:" + Arrays.toString(numeros));
        System.out.println("Array de letras:" + Arrays.toString(letras));

        //Organizar un array de enteros
        Arrays.sort(numerosDesordenados);
        System.out.println("Array ordenado:" + Arrays.toString(numerosDesordenados));
        //Organizar un array de strings
        Arrays.sort(letras);
        System.out.println("Array de letras ordenado:" + Arrays.toString(letras));

        //Comparar valores de dos arrays
        int[] numeros1 = {1,2,3};
        int[] numeros2 = {1,20,3};
        boolean iguales = Arrays.equals(numeros1, numeros2);
        System.out.println("Los arrays son iguales: " + iguales);

        //Como llenar un array autamáticamente con un valor específico
        int[] llenar = new int[5];
        Arrays.fill(llenar, 1);
        System.out.println("Array lleno:" + Arrays.toString(llenar));

        //Como copiar un array
        int[] original = {1,2,3};
        int[] copia = Arrays.copyOf(original, 5);
        System.out.println("Array copiado:" + Arrays.toString(copia));

    }
}
