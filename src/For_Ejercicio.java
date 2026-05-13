import javax.swing.*;

public class For_Ejercicio {
    public static void main(String[] args) {
        boolean validar = false;
        for (int i = 0; !validar; i++) {
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email...");

            if (email.contains("@") && email.endsWith(".com") && (email.contains("hotmail") || email.contains("gmail") || email.contains("yahoo"))) {

                JOptionPane.showMessageDialog(null, "Email ingresado correctamente");
                validar = true;
                break;
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Email no contiene @");
            } else if(!email.contains("hotmail") && !email.contains("gmail") && !email.contains("yahoo")) {
                JOptionPane.showMessageDialog(null, "Email no contiene un proveedor válido (hotmail, gmail, yahoo)");

            } else {
                JOptionPane.showMessageDialog(null, "Email no termina con .com");
            }

        }

    }
}
