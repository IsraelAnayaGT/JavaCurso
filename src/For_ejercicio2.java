import javax.swing.JOptionPane;

public class For_ejercicio2 {
    public static void main(String[] args){

        boolean validar = false;

        for (int f = 0; !validar; f++){
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email...");

            if(email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Email ingresado correctamente");
                validar = true;
                break;
            }else if(!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Email no contiene @");
            }else{
                JOptionPane.showMessageDialog(null, "Email no termina con .com");
            }
        }
    }
}
