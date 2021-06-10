/*
    Descripción: Matriz de objetos
    Fecha: 10/06/2021
    Autor: roberth
 */

import java.util.Scanner;

public class ArregloClasePersona {
    public static void main(String[] arg) {
       
        System.out.println("Manejo de una matriz de objetos de tipo Persona");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamanio de la matriz de Personas");
        //tamanio es la dimension de la matriz
        int tamanio = scanner.nextInt();
        Persona matriz[][] = new Persona[tamanio][tamanio];

        System.out.println("Ingresa la información a almacenar de personas:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Creando persona ["+i+j+"]");
                System.out.println("Ingresa el nombre, edad y peso");
                Persona objPersona = new Persona(scanner.next(), scanner.nextInt(), scanner.nextDouble());
                matriz[i][j] = objPersona;
            }
        } 
        System.out.println("Contenido de la matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Nombre: "+matriz[i][j].nombre +"Edad: "+matriz[i][j].edad + "\t");
                matriz[i][j].mostrarDatos();
                matriz[i][j].contarCaracterNombre(matriz[i][j].nombre);
            }
            System.out.println();
        }  
        calcularEdadDiagonalPrincipal();
    }
    public static void calcularEdadDiagonalPrincipal(){
        System.out.println("Calcular la diagonal principal");
    }

    public static void listarPorCiudad(){
        //logica donde se listaran todas las personas 
        //por edad
      //  if (matriz[i][j].edad > 30 || matriz[i][j].edad < 50)
    //    System.out.println("Calcular la diagonal principal");

    }
}
class Persona{
    String nombre;
    int edad;
    double peso;
    String ciudad;

    Persona(){
    }
    Persona(String nombre, int edad, double peso){
       this.nombre = nombre;
       this.edad = edad;
       this.peso= peso;
    }
    public void mostrarDatos(){
        System.out.println("Datos: --> "+this.nombre+" "+this.edad+" "+this.peso);
    }

    public void contarCaracterNombre(String nombre){
        System.out.println("El nombre "+ nombre +" tiene "+ nombre.length()+" caracteres");
    }
}

