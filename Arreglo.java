/*
   Descripcion: Trabajando con arreglos unidimensionales, Vector
   Fecha: 20/05/2021
   Autor:Roberth
*/

   import java.util.Scanner;

   public class Arreglo{
   	public static void main(String [] arg){
   		System.out.println("Ejercicio de Java utilizando arreglos");
   		String palabra="";
   		int contador=0;
   		Scanner valor = new Scanner(System.in);
		//Primera forma de declaracion de un arreglo
   		int arreglo[] = new int[4];
   		for (int i=0;i < 4 ; i++) {
   			System.out.println("Ingresar el elemento ["+i+"]:" );
   			arreglo[i] = valor.nextInt();			
   		}
   		System.out.println("Ver el contenido del arreglo:");

   		for(int j=0;j< arreglo.length;j++){
           System.out.print(arreglo[j] + "\t");
   		}
   		System.out.println();
        int arreglo2 [] = {3,8,1,9};

        for (int i=0;i<arreglo2.length; i++) {
        	System.out.print(arreglo2[i] + "\t");
        }
        System.out.println("Ingresa una palabra:");
        palabra = valor.next();

        for (int i=0;i<palabra.length(); i++ ) {
        	System.out.println("El caracter "+ palabra.charAt(i)+" tiene la posicion "+contador);
        	contador++;        	
        }



/*
		//Segunda forma
		int arreglo2 [] = {5,7,1,3};

        //Tercera forma
		int arreglo3 [] = new int[n];

		*/

	}
	
}