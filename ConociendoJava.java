/*
    Descripcion: Ejercicio para crear un menú y conocer el lenguaje Java
    Fecha: 17/05/2021
    Autor: Roberth
*/
import java.util.Scanner;

public class ConociendoJava{

  	public static void main(String [] arg){
  		System.out.println("Hola Mundo!");
  		Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do{
        	System.out.println("Elige una opcion: ");
        	System.out.println("1. Ver el funcionamiento del IF ");
        	System.out.println("2. Usar un for");
        	System.out.println("3. Transformar un Decimal a Binario");
        	System.out.println("4. Opcion 4");
        	System.out.println("5. Salir");

	  		opcion = entrada.nextInt();
	  		switch (opcion)
	  		{
	  			case 1: 
	  				  System.out.println("Ingresaste a la opcion 1");
	  				  System.out.println("Verificar si el numero es par");
	  				  System.out.println("Ingresa el numero a verificar: ");
	  				  int n = entrada.nextInt();
                      if ( n % 2 == 0) {  	
                      	System.out.println("Es par");
                      }
                      else{
                      	System.out.println("Es impar");
                      }
	  				  break;
	  		    case 2: 
	  				  System.out.println("Ingresaste a la opcion 2");
	  				  break;
	  		    case 3: 
	  				  System.out.println("Ingresaste a la opcion 3");
	  				  saludar();
	  				  break;
	  		    case 4: 
	  				  System.out.println("Ingresaste a la opcion 4");
	  				  break;
	  		    default:
	  				  System.out.println("Saliendo del programas");
	  				  break;
	  		}
  		}while (opcion<5);
   	}
   	public static void saludar(){
         System.out.println("Buenos dias");
   	}
}