package POO_Encapsulacion.Paquete2;
import POO_Encapsulacion.Paquete1.Animal;

public class Gato {
    public static void main(String[] args){
        Animal gato1 = new Animal();
        gato1.maulla();
        
        System.out.println("El nombre del gato es:"  + gato1.nombre);
    }
}
