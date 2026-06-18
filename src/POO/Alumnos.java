package POO;

class Alumnos {
    String nombre, asignatura;
    int nota;

    // constructor por defecto
    public Alumnos() {
        nombre = "Miguel";
        asignatura = "Matemáticas";
        nota = 80;
    };

     String CambiaDatos(int nuevaNota){
            nota = nuevaNota;
            return "Nueva nota: " + nota;
        };

        void DimeDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Asignatura: " + asignatura);
            System.out.println("Nota: " + nota);
        }



    public static void main(String[] args) {
        Alumnos persona1 = new Alumnos();
        persona1.DimeDatos();
        persona1.CambiaDatos(90);
        persona1.DimeDatos();
       
    }
}
