package POO;

//Creación de una clase
public class Automoviles {
    //Crear atributos o propiedades de la clase
    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2020;
    int can_ruedas = 4;
    boolean camara = true;

    public static void main(String[] args) {
        //Instanciar una clase / crear un objeto
        Automoviles auto1 = new Automoviles();
        Automoviles auto2 = new Automoviles(); 

        //Consultar valores de los atributos del objeto
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Año: " + auto1.anio);
        System.out.println("Cantidad de ruedas: " + auto1.can_ruedas);
        System.out.println("¿Tiene cámara? " + auto1.camara);

    }
}
