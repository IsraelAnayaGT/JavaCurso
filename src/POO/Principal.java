
package POO;

import java.util.Scanner;

class Cliente{
    String NombreCliente;

    Cliente(String nombre){
        this.NombreCliente = nombre;
    }
    String DimeNombre(){
        return NombreCliente;
    }
}

class Prestamo {
    double cuota;

    Prestamo(double cuota){
        this.cuota = cuota;
    }

    void Analizacuota(){
        if(cuota>=10000){
            System.out.println("Deuda cancelada");
        }else{
            double pendiente = 10000 - cuota;
            System.out.println("Abono a deuda " + cuota);
            System.out.println("Pendiente para saldo: " + pendiente);
        }
    }
}

class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Recopilación de datos del usuario
        System.out.println("Ingrese nombre...");
        Cliente persona = new Cliente(entrada.next());

        System.out.println("Ingrese cuota...");
        Prestamo deposito = new Prestamo(entrada.nextDouble());

        //Metodos de analizar los datos
        System.out.println(persona.DimeNombre());
        deposito.Analizacuota();
    }
    
}