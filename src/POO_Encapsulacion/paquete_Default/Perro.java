package POO_Encapsulacion.paquete_Default;

//Codigo que muestra el funcionamiento del modificador de acceso default, ya que la clase Animales y la clase Perro estan en el mismo paquete, por lo que se puede acceder a los atributos y metodos de la clase Animales desde la clase Perro.

public class Perro {
    public static void main(String[] args){
        Animales perro1 = new Animales();
        perro1.nombre = "Firulais";
        perro1.raza = "Labrador";
        perro1.edad = 5;
        perro1.Datos();
    }
}
