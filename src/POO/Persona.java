
package POO;

class Persona {
    String nombre = "Juan";
    int edad = 25;
    double peso = 70.5;
    boolean soltero = true;

    //Crear metodo get
    String DimeNombre(){
        return nombre + " está aprendiendo Java";
    }

    int DimeEdad(){
        return edad;
    }

    //Crear metodo set
    void DimePeso(){
        if(peso >=  70 || edad > 30){
            System.out.println(nombre + " Debe hacer ejercicio");
        }else {
            System.out.println(nombre + " Está en su peso ideal");
        }

        if(soltero){
            System.out.println(nombre + " Está soltero");
        }else {
            System.out.println(nombre + " No está soltero");
        }
    }

    public static void main(String[] args){
        Persona persona1 = new Persona();

        System.out.println("Nombre: " + persona1.DimeNombre());
        System.out.println("Edad: " + persona1.DimeEdad());

        persona1.DimePeso();
      
    }
}