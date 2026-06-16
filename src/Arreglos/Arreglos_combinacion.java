public class Arreglos_combinacion {
    public static void main(String[] args) {
        String[] productos = {
                "Martillo",
                "Sierra",
                "Taladro",
                "Llave inglesa",
                "Destornillador",
        };
        double[] precios = {
                15.99,
                25.50,
                245.00,
                210.75,
                5.25
        };
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i] + " - Precio: $" + precios[i]);

            if(precios[i] < 100.0){
                System.out.println("No paga impuestos");
            }else{
                System.out.println("Paga impuestos");
            }
        }
    }
}