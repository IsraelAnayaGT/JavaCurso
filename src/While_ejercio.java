import javax.swing.JOptionPane;

public class While_ejercicio {
    public static void main(String[] args){
        
        final String u_correcto = "Usuario";
        final String p_correcto = "Abc123%";

        String username, password;
        int intento = 0;
        final int max_intentos = 3;

        while (intento < max_intentos){
            username = JOptionPane.showInputDialog(null,"Ingrese el nombre de usuario...");

            password = JOptionPane.showInputDialog(null,"Ingrese la contraseña...");

            if (username.equals(u_correcto) && password.equals(p_correcto)){
                JOptionPane.showMessageDialog(null,"Acceso correcto! " + "Bienvenido " + u_correcto);
                break;
            } else {
                intento++;
                if (intento < max_intentos){
                    JOptionPane.showMessageDialog(null,"Credenciales incorrectas. Intento " + intento + " de " + max_intentos + ".");
                } else {
                    JOptionPane.showMessageDialog(null,"Has alcanzado el número máximo de intentos. Acceso bloqueado.");
                }
            }
            
        }
    }
}
