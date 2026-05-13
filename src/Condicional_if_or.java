public class Condicional_if_or {
    static void main() {
        boolean Domingo = true;
        boolean Vacaciones = true;

        //Ingresando datos
        if (Domingo == true || Vacaciones == true) {
            System.out.println("Puedes descansar");
        } else {
            System.out.println("Tienes que trabajar");
        }
    }
}
