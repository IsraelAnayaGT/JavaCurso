import java.util.Scanner;

public class Condicional_switch {
    static void main() {
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese día a consultar");
        DiaSemana = entrada.nextInt();


        switch (DiaSemana) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miércoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            case 6:
                System.out.println("Hoy es Sábado");
                break;
            case 7:
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Número de día no válido");
                break;

        }
    }
}


