import java.lang.Math;

public class Test{
	public static void main(String[] args){
		double a= 4.0;
		double b= 3.0;
		double respuesta=0.0;

        String mensaje = "Iniciando en POO Paralelo 2A";
		double Rsuma= a*b;
		System.out.println("La suma es:"+ Rsuma);
		for (int i=0;i<10 ;i++ ) {
			System.out.println(i + " ");
			if ((i%2) == 0) continue;
			System.out.println();
		}
        System.out.println(mensaje);
        System.out.println(mensaje.charAt(0));
        System.out.println(mensaje.charAt(13));
        respuesta = Math.sqrt(a);
        System.out.println(respuesta);
        respuesta = Math.pow(a,b);
        System.out.println(respuesta);
	}      
}
