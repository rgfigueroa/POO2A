import java.util.Scanner;

public class ejercicioMatriz {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);        
            Producto arregloP[] = new Producto[2];
            System.out.println("Ejercicio de matriz de objetos");    
          
            for(int i = 0; i < 2 ; i++){
                System.out.println("Objeto Producto "+i+ ":");    
                Producto objetoProducto = new Producto(entrada.next(),entrada.next(),entrada.nextDouble());
                arregloP[i] = objetoProducto;
            }
            System.out.println("Ver Productos Creados:");    

            for(int i = 0; i < 2 ; i++){
                System.out.print(arregloP[i].color+ "\t");
                System.out.print(arregloP[i].precio+ "\t");
                arregloP[i].costoTotal();
            }
    }
}
class Producto{
    String color;
    String marca;
    double peso;
    double precio;

    //constructor
    Producto(){
    }
    Producto(String marca){
        this.marca= marca;
    }
    Producto(String c, String m, double precio){
        this.color = c;
        this.marca= m;
        this.precio =precio;
    }
    public void costoTotal(){
        //Permitira conocer el costo final de todos productos
        double preciofinal = this.precio * 1.12;
        System.out.println("El precio final del producto es: "+ preciofinal);
    }
    public void mostrarInformacion(){
       //Mostrar los datos de cada producto
       System.out.println("Aqui la marca del producto: -->" + marca + color);
    }
}

Activadad en Clase:

1. Promedio  de los  precios de los productos
2. Listar todos los productos con su color
3. Listar el promedio del Iva (12%)