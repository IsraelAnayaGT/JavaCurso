import java.util.Scanner;

public class InputDatos {
    static void main(String[] args) {
        String nombre;
        int edad;

        //Ingreso de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre...");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad...");
        edad = entrada.nextInt();

        //Salida de datos
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
}
