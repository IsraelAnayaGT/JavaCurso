import java.util.Arrays;
public class Arreglos_caracteres {
    public static void main(String[] args) {
        String[] productos = new String[5];

        productos[0] = "Laptop";
        productos[1] = "Smartphone";
        productos[2] = "Tablet";
        productos[3] = "Reloj";
        productos[4] = "Auriculares";   

        Arrays.sort(productos);

        System.out.println("Producto 1: " + productos[0]);
        System.out.println("Producto 2: " + productos[1]);
        System.out.println("Producto 3: " + productos[2]);
        System.out.println("Producto 4: " + productos[3]);
        System.out.println("Producto 5: " + productos[4]);
    }
}