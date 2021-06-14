import java.util.Scanner;

public class EvaluacionUnoDemo {
    public static void main(String[] args) {
        // Aqui Stalin vas a crear un programa para verificar el numero de Cedula.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que permite ingresar cedulas");
        String matrizCedulas[][] = new String[2][2];
        for (int i = 0; i < matrizCedulas.length; i++) {
            for (int j = 0; j < matrizCedulas.length; j++) {
                System.out.println("Ingresar la cedula en la posicion [" + i + "," + j + "]");
                matrizCedulas[i][j] = entrada.next();
            }
        }
        System.out.println("Presento la matriz de cedulas cargada Matriz A");
        for (int i = 0; i < matrizCedulas.length; i++) {
            for (int j = 0; j < matrizCedulas.length; j++) {
                System.out.print(matrizCedulas[i][j] + "\t");
            }
            System.out.println();
        }
        calcularSumaPorPosicion(matrizCedulas);
        verificarMatrizCedula(matrizCedulas);
    }

    public static void calcularSumaPorPosicion(String mc[][]) {
        // calcula la suma de todos los digitos de una posicion en la matriz[i][j]
        System.out.println("Matriz B");
        int s = 0;
        int longitud = 0;
        char caracter;
        int elemento = 0;

        for (int i = 0; i < mc.length; i++) {
            for (int j = 0; j < mc.length; j++) {
                if (j > i) {
                    longitud = mc[i][j].length();
                    s = 0;
                    for (int k = 0; k < longitud; k++) {
                        caracter = mc[i][j].charAt(k);
                        elemento = Character.getNumericValue(caracter);
                        System.out.print("D:" + elemento + "\t");
                        s = s + elemento;
                    }
                    // System.out.print("la longitud:"+ longitud);11
                    System.out.print("La suma es:" + s + "\t");
                }
                System.out.println();
            }

        }
    }

    public static void presentarMatriz(String m[][]) {
        // presenta la matriz ordenada
    }

    public static void verificarMatrizCedula(String mc[][]) {
        String cedula = "";
        boolean respuesta = false;
        String secuencia[] = { "2", "1", "2", "1", "2", "1", "2", "1", "2" };

        for (int i = 0; i < mc.length; i++) {
            for (int j = 0; j < mc.length; j++) {
                cedula = mc[i][j];
                System.out.println("Cedula ingresada " + cedula);
                respuesta = verificarUnNumeroCedula(cedula);
                System.out.println("La cedula:" + cedula + " es:" + respuesta);
            }
        }
    }

    public static boolean verificarUnNumeroCedula(String cedula) {
        String cedulaRevisar = cedula;
        int pos = cedulaRevisar.length();
        int valorPos = Integer.parseInt(cedulaRevisar.substring(pos));
        int resmultiplicacion = 0;
        int sumaTotal = 0;
        int resto = 0;
        int decenaMayor = 0;
        boolean res = false;
        String secuencia[] = { "2", "1", "2", "1", "2", "1", "2", "1", "2" };
        for (int i = 0; i < cedulaRevisar.length() - 1; i++) {
            System.out.println(
                    "Res: " + Character.getNumericValue(cedula.charAt(i)) * Integer.parseInt(secuencia[i]) + "\t");
            resmultiplicacion = Character.getNumericValue(cedula.charAt(i)) * Integer.parseInt(secuencia[i]);
            if (resmultiplicacion > 9) {
                resmultiplicacion = resmultiplicacion - 9;
            }
            System.out.println("Res menos 9: " + resmultiplicacion + "\t");
            sumaTotal = sumaTotal + resmultiplicacion;
        }
        System.out.println("Suma total: " + sumaTotal + "\t");
        resto = sumaTotal % 10;
        resto = 10 - resto;
        decenaMayor = sumaTotal + resto;
        System.out.println("Modulo para la decena mayor" + decenaMayor);

        if ((valorPos == (decenaMayor - sumaTotal))) {
            System.out.println("Cedula Valida");
            return true;
        } else {
            System.out.println("Cedula Invalida");
            return false;
        }
    }
}
