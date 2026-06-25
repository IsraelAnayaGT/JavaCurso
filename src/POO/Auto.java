package POO;
import java.util.*;

import POO.Alumnos;

 class Auto {
    // Sobre carga de metodos con constructores
    String marca , modelo;
    int ano;
    
    //Scanner entrada = new  Scanner(System.in)
    

    //Metodo 1 sin parametros
    public Auto(){
        marca = "Ford";
        modelo = "Fiesta"; 
        ano = 2010;
    }


    //Metodo 2 con un parametro
    public Auto(String marca){
        this.marca = marca;
        this.modelo = "Matrix";
        this.ano = 2010;
    }

    void MostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public static void main(String[] args){
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Chevrolet");
        auto1.MostrarInfo();
        auto2.MostrarInfo();

        Alumnos alumno1 = new Alumnos();
        alumno1.nombre = "Maria";
        System.out.print("Nombre: " + alumno1.nombre);

    }
}
