import java.util.Scanner;

public class Metodo_Nextline {
    static void main() {
        String texto1, texto2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer texto...");
        texto1 = entrada.nextLine();
        System.out.println("Ingrese el segundo texto...");
        texto2 = entrada.nextLine();

        System.out.println("El primer texto es: "+texto1);
        System.out.println("El segundo texto es: "+texto2);
    }
}
