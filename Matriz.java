/*
   Descripción: Trabajando con matrices y posiciones
   Fecha: 27/05/2021
   Fecha autualizacion: 27/10/2021
   Autor: Roberth
*/
   import java.util.Scanner;

   public class Matriz{
   	public static void main(String[] args) {
   		Scanner entrada = new Scanner(System.in);
   		System.out.println("Define el tamaño de la matriz");
   		int n = entrada.nextInt();
   		
   		int matriz [][] = new int [n][n];		

         //For para ingresar la información de la matriz
   		for (int i=0;i<n ;i++) {
   			for (int j=0;j<n ;j++ ) {
   				System.out.println("Elemento posicion ["+i+"]"+"["+j+"]: ");
   				matriz[i][j] = entrada.nextInt();
   			}
   		}	
         //For para presentar información de la matriz
         for (int i=0;i<n ;i++) {
            for (int j=0;j<n ;j++ ) {
               System.out.print(matriz[i][j]+"\t ");
            }
            System.out.println();
         }

         //Diagonal Principal
         int suma=0,sumaDSecundaria=0, sumaSDP=0;
         for (int i=0;i<n ;i++) {
            for (int j=0;j<n ;j++ ) {
             //Para la DPrincipal
             if(i==j){
                suma=suma + matriz[i][j];
             }
             //Para la DSecundaria
             if(i+j == n-1){
                sumaDSecundaria = sumaDSecundaria + matriz[i][j];
             }
             //Elementos sobre la diagonal principal
             if(j>i)
             {
               sumaSDP=sumaSDP+ matriz[i][j];
             }
          }
          System.out.println();
       }
       System.out.println("La suma Diagonal Principal es:" + suma);
       System.out.println("La suma de la Diagonal Secundaria es:" + sumaDSecundaria);
       System.out.println("La suma de la SDP es:" + sumaSDP);
   }
}