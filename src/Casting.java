public class Casting {
    static void main(String[] args) {
        //De texto a entero
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Número entero: " + numeroEntero);

        //De entero a texto
        int entero = 456;
        String enteroTexto = String.valueOf(entero);
        System.out.println("Número en texto: " + enteroTexto);

        //Doble a entero
        double numeroDoble = 3.14;
        int numeroEntero2 = (int) numeroDoble;
        System.out.println("Número entero (doble a entero): " + numeroEntero2);

        //Entero a doble
        int entero2 = 789;
        double enteroDoble = (double) entero2;
        System.out.println("Número doble (entero a doble): " + enteroDoble);
    }
}
