/*
   Descripcion: Matriz de objetos estudiantes
   Fecha: 31/05/2021
   Autor: Roberth
*/
import  java.util.Scanner;

public class MatrizEstudiante{
   public static void main(String [] arg){
     Scanner entrada= new Scanner(System.in);
     System.out.println("Define el tamaño de matriz de Estudiantes");
     int n = entrada.nextInt();
     String nom;
     int c;
     int e;
    
     System.out.println("3Creacion de Objetos Estudiantes");

     Estudiante matrizEstudiantes[][] = new Estudiante[n][n];

     for (int i=0;i<n ;i++) {
     	for (int j=0;j<n ;j++ ) {
		     //Creacion de objeto estudiante
		     System.out.println("Nombre:");
		     nom = entrada.next();
		     System.out.println("Ciclo:");
		     c = entrada.nextInt();
		     System.out.println("Edad:");
		     e = entrada.nextInt();
		
		     Estudiante estudianteUno = new Estudiante(nom,c,e);	
     		 matrizEstudiantes[i][j] = estudianteUno;

     	}
     }
     int suma=0;
     double promedio=0.0;
     for (int i=0;i<n ;i++) {
     	for (int j=0;j<n ;j++ ) {
		    System.out.print("N:"+matrizEstudiantes[i][j].nombre+" E:" +matrizEstudiantes[i][j].edad);   
		    suma= suma+matrizEstudiantes[i][j].edad;
     	}
        System.out.println();
     }
     System.out.println("Suma Total de edades: "+suma);
     promedio=Integer.valueOf(suma);
     promedio = promedio/(n*n);

     System.out.println("El Promedio de Edad es: "+promedio);

   }

}

class Estudiante{

   //Atributos
   String nombre;
   int ciclo;
   int edad;

   Estudiante(String n, int c, int e){
   	 this.nombre=n;
   	 this.ciclo=c;
   	 this.edad=e;
   }

   //Metodos
   public void hacerDeberes(){

   }

   public void matricular(String nombre){
   	   System.out.println(nombre+" Tu estas matriculando...");
   }

   public void asistir(){

   }

   public void mostrarInformacion(){
        System.out.println("El estudiante"+this.nombre+" "+" tiene "+this.edad+" anios");
   }

}

