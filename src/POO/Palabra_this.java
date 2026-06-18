package POO;

// Hace que una variable de clase se pueda utilizar como variable de instancia dentro de un método, para evitar confusiones entre variables locales y de instancia con el mismo nombre.

class Palabra_this {

    String nombre = "Ana";
    
    String DimeNombre(String nombre){
        this.nombre = nombre; 
        return nombre;
    }

    void MuestraNombre(){
        System.out.println("El nombre es:" + nombre);
    }
    public static void main(String[] args){
        Palabra_this persona = new Palabra_this();
        persona.DimeNombre("María");
        persona.MuestraNombre();

    }
}
