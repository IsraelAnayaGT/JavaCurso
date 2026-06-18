package POO;

 class Metodos_Paramatros {
    
    int Suma(int num1, int num2){
        return num1 + num2;
    } 

    int Resta(int num1, int num2){
        return num1 - num2;
    }

    int Multiplicacion(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }

    double Division(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0; // Retorna 0 o podrías lanzar una excepción
        }
    }

    double Potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }

    void DameDatos(String nombre, int edad, double estatura){ 
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");
    }

    public static void main(String[] args){
        Metodos_Paramatros operacion = new Metodos_Paramatros();

        int resultado = operacion.Suma(5, 10);
        System.out.println("El resultado de la suma es: " + resultado);
        resultado = operacion.Resta(15, 7);
        System.out.println("El resultado de la resta es: " + resultado);
        resultado = operacion.Multiplicacion(2, 3, 4);
        System.out.println("El resultado de la multiplicación es: " + resultado);
        double resultadoDivision = operacion.Division(10, 2);
        System.out.println("El resultado de la división es: " + resultadoDivision);
        double resultadoPotencia = operacion.Potencia(2, 3);
        System.out.println("El resultado de la potencia es: " + resultadoPotencia);
        operacion.DameDatos("Carlos", 30, 1.75);
    }
}
