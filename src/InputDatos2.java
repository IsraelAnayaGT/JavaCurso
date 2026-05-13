import javax.swing.*;

public class InputDatos2 {
    static void main() {
        String nombre;
        int edad;

        //INGRESO DE DATOS
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre..");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad..");
        edad = Integer.parseInt(edad2);

        ///Mostrar datos
        JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre + "\n"+
                                                                       "Su edad es: " + edad);

    }
}
