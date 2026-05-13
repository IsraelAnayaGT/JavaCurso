import javax.swing.*;

public class Condicional_if_and {
    static void main() {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad:");
        edad = Integer.parseInt(edad2);

        //Analizando datos
        if(edad<12){
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", eres un niño.");
        } else if(edad>=12 && edad<18){
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", eres un adolescente.");
        } else if(edad>=18 && edad<60){
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", eres un adulto.");
        } else {
            JOptionPane.showMessageDialog(null, "Hola " + nombre + ", eres un adulto mayor.");

        }

    }
}
