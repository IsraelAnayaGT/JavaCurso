import javax.swing.*;

public class While_Ejercicio {
    public static void main(String[] args) {
        final String u_correcto = "Usuario";
        final String p_correcta = "Abc123%";

        String username, password;
        int intentos = 0;
        final int max_intentos = 3;

        while (intentos < max_intentos) {
            username = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

            if (username.equals(u_correcto) && password.equals(p_correcta)) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido, " + u_correcto + "!");
                break;
            } else {
                intentos++;
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos " + "\n" + " Intente de nuevo...");
            }
            if (intentos > 2) {
                JOptionPane.showMessageDialog(null, "Has excedido el número de intentos permitidos. Acceso bloqueado." + "\n" + "Por favor, inténtalo más tarde.");
            }

        }
    }
}
