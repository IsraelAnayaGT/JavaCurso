import java.util.Scanner;

public class Blucle_While {
    static void main() {

        int f = 0;
        Scanner entrada = new Scanner(System.in);

        //bucle while
            /*while (f < 5) {
                System.out.println(f);
                if (f == 3) {
                    System.out.println("Estamos en la vuelta no. 3");
                }
                f++;
            }*/

        //tabla de multiplicar con while
        /*int valor;
        System.out.println("Ingrese tabla a consultar...");
        valor = entrada.nextInt();
        while(f <= 10){
            System.out.println(valor + " x " + f + " = " + (valor * f));
            f++;
        }
        System.out.println("Fin del programa");*/

        //Control de login de usuario con while
        final String username = "admin";
        final String password = "1234";
        boolean acceso = false;

        while (!acceso) {
            System.out.println("Ingrese su usuario...");
            String usuario = entrada.nextLine();
            System.out.println("Ingrese su contraseña...");
            String clave = entrada.nextLine();

            if (username.equals(usuario) && password.equals(clave)) {
                System.out.println("Acceso concedido!");
                acceso=true;
            } else {
                System.out.println("ERROR: Usuario o Contraseña incorrectos!" +
                        "\nIntente de nuevo...");
            }
        }
        System.out.println("Fin del bucle while");
    }
}
