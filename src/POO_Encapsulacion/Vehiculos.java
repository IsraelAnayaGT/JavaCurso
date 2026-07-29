package POO_Encapsulacion;
import POO_Encapsulacion.prueba.Persona;

//En este codigo estamos probando el funcionamiento del modificador Private, el cual solo permite que la variable o metodo sea accedida dentro de la misma clase, es decir, no se puede acceder desde otra clase.

public class Vehiculos {
    private String marca = "Audi";
    private int anio = 2024;

    void DatosVehiculo(){
        System.out.println("Marca:" + marca);
        System.out.println("Año: " + anio);
    }

    public static void main(String[] args){
        Vehiculos auto1 = new Vehiculos();
        Persona persona1 = new Persona();
        persona1.Dimenombre();
        auto1.DatosVehiculo();
       //TipoVehiculo mitipo = new TipoVehiculo();
//--> // System.out.println("tipo:"+ mitipo.tipo2);
    }
}
