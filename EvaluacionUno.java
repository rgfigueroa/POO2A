import java.util.Scanner;

public class EvaluacionUno {
   public static void main(String[] args) {
      // Aqui Stalin vas a crear un programa para verificar el numero de Cedula.
     Scanner entrada = new Scanner(System.in);
     System.out.println("Programa que permite ingresar cedulas");
     String matrizCedulas [][] = new String[3][3];
     for (int i = 0; i < matrizCedulas.length; i++) {
         for (int j = 0; j < matrizCedulas.length; j++) {
             System.out.println("Ingresar la cedula en la posicion ["+i+","+j+"]");
             matrizCedulas[i][j]= entrada.next();
         }
     }
     System.out.println("Presento la matriz de cedulas cargada Matriz A");
     for (int i = 0; i < matrizCedulas.length; i++) {
         for (int j = 0; j < matrizCedulas.length; j++) {
            System.out.print(matrizCedulas[i][j]+"\t");
         }
         System.out.println();
     }
     System.out.println("Matriz B");
     int suma=0;

     for (int i = 0; i < matrizCedulas.length; i++) {
         for (int j = 0; j < matrizCedulas.length; j++) {
             suma = suma + matrizCedulas[i][j].length();
             System.out.print("la suma es:"+ suma);
         }
         System.out.println();
     }

   }  
}
