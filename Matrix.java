/*
   Descripción: Trabajando con matrices
   Fecha: 21/05/2021
   Fecha autualizacion: 20/10/2021
   Autor: Roberth
*/
   import java.util.Scanner;

   public class Matrix{
   	public static void main(String[] args) {
   		Scanner entrada = new Scanner(System.in);
   		System.out.println("Define el tamaño de la matriz");
   		int n = entrada.nextInt();
   		int bandera=0;

   		int matriz [][] = new int [n][n];		

   		for (int i=0;i<n ;i++) {
   			for (int j=0;j<n ;j++ ) {
   				System.out.println("Elemento posicion ["+i+"]"+"["+j+"]: ");
   				matriz[i][j] = entrada.nextInt();
   			}
   		}	
   		bandera = mostrar(matriz, n,n);

   		if(bandera == 1){
   			System.out.println("Matriz ordenada");
   		}
   		else{
   			System.out.println("Matriz No se pudo ordenar");
   		}
   	}
   	public static int mostrar(int [][] m, int f, int c){
   		int respuesta=0;
   		if(respuesta == 0){
   			System.out.println("Mostrar contenido de la matriz");
   			for (int i=0;i<f ;i++) {
   				for (int j=0;j<c ;j++ ) {
   					System.out.print(m[i][j]+"\t ");
   				}
   				System.out.println();
   			}
   			respuesta=1;
   		}
   		return respuesta;
   	}
   }