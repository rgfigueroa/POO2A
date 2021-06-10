import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class ArregloPersonas {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String matriz[][] = new String[3][3];
        String respuesta = "";
        String dato = "";
        System.out.println("Ingresa la información a almacenar:");
        dato = scanner.next();

        for (int i = 0; i < dato.length(); i++) {
            if (dato.charAt(i) % 2 == 0) {
                System.out.println("Caracter par: " + dato.charAt(i));
            }
        }
        System.out.println("SubString: " + dato.substring(4));
        System.out.println("SubString: " + 1107042318);
        System.out.println("Convertir a mayuscula" + dato.toUpperCase());

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.next();
            }
        } 
        System.out.println("Contenido de la matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+ "\t");
            }
            System.out.println();
        } 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    respuesta+=matriz[i][j];
                }
            }
        }
        System.out.println("Matriz con los tañamos por cada posición");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j].length()+ "\t");                
            }
            System.out.println();
        }

       String mi_arreglo[] = {"hola","12323","Hola","3243"};
       for (int i = 0; i < mi_arreglo.length; i++) {
           System.out.println(mi_arreglo[i]);
           System.out.println(mi_arreglo[i].length());
       }

    }
}
// 1107042318