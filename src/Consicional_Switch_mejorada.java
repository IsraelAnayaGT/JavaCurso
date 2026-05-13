import java.util.Scanner;

public class Consicional_Switch_mejorada {
    static void main() {
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        //ingresando datos
        System.out.println("Ingrese día a consultar");
        DiaSemana = entrada.nextInt();


        switch (DiaSemana){
            case 1 -> System.out.println("Hoy es Lunes");

            case 2 -> System.out.println("Hoy es Martes");

            case 3 -> System.out.println("Hoy es Miércoles");

            case 4 -> System.out.println("Hoy es Jueves");

            case 5 -> System.out.println("Hoy es Viernes");

            case 6 -> System.out.println("Hoy es Sábado");

            case 7 -> System.out.println("Hoy es Domingo");

            default -> System.out.println("Número de día no válido");


        }
    }
}
