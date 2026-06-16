public class Arreglos_bucles {
    public static void main(String[] args) {
        String[] productos = {
                "Martillo",
                "Sierra",
                "Taladro",
                "Llave inglesa",
                "Destornillador",
               
        };


        // Recorrer array con un bucle for

        //  for (int i = 0; i < productos.length; i++) {
        //      System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        //  }

        // Reccorrer array con bucle while
        
        int f = 0;
        while (f < productos.length) {
            System.out.println("Producto: " + productos[f]);
            f++;
        }
    }
}
