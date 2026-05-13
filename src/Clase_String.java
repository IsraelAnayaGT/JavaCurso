import java.util.Scanner;

public class Clase_String {
    static void main() {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //Ingresando datos
        System.out.println("Ingrese primera palabra");
        palabra1 = entrada.next();
        System.out.println("Ingrese segunda palabra");
        palabra2 = entrada.next();

        //comparar textos
        if(palabra1.equals(palabra2)){
            System.out.println(palabra1+" es igual a: "+palabra2);
        }else{
            System.out.println(palabra1+" no es igual a: "+palabra2);
        }

        //Comparar textos sin importar mayusculas o minusculas
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println(palabra1+" es igual a: "+palabra2+" sin importar mayusculas o minusculas");
        }else{
            System.out.println(palabra1+" no es igual a: "+palabra2+" sin importar mayusculas o minusculas");
        }

        //Comparar cantidad de caracteres
        if(palabra1.compareTo(palabra2)==0){
            System.out.println(palabra1+" tiene las misma letras que: "+palabra2);
        }else{
            if(palabra1.compareTo(palabra2)>0) {
                System.out.println(palabra1 + " tiene mas letras que: " + palabra2);
            }else{
                System.out.println(palabra1 + " tiene menos letras que: " + palabra2);
            }
        }

        //Saber el primer caracter de una palabra
        char primerCaracter = palabra1.charAt(0);
        System.out.println("El primer caracter de "+palabra1+" es: "+primerCaracter);

        //Cantidad de caracteres de un texto
        System.out.println("Cantidad de caracteres de "+palabra1+":"+palabra1.length());
        System.out.println("Cantidad de caracteres de "+palabra2+":"+palabra2.length());

        //Identificar varios caracteres en un texto o palabra
        System.out.println("Primeras 3 letras: "+palabra1.substring(0,3));
        System.out.println("Primeras 3 letras: "+palabra2.substring(0,3));

        //Buscar caracteres que coincidan en dos palabras
        int coincidencia = palabra1.indexOf(palabra2);
        if(coincidencia==-1){
            System.out.println("No se encontraron coincidencias entre: "+palabra1+" y "+palabra2);
        }else{
            System.out.println("Se encontraron coincidencias entre: "+palabra1+" y "+palabra2);
        }
        //Llevar a mayusculas
        System.out.println(palabra1+" en mayusculas es: "+palabra1.toUpperCase());
        //Llevar a minusculas
        System.out.println(palabra1+" en minusculas es: "+palabra1.toLowerCase());
    }
}
