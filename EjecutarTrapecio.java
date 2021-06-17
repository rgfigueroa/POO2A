import java.util.Scanner;

public class EjecutarTrapecio{
    public static void main(String[] args) {
        System.out.println("Ejecutar el trapecio");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos obj:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Trapecio objeto = new Trapecio();
            objeto.setIva(0.09);
            System.out.println ("Presentar:"+objeto.getIva());
            
        }
    }
}
class Trapecio {
    private double baseM;
    private double basemenor;
    private double altura;
    private double iva= 0.12;
    
    //encapsulado set y met el atributo iva
    public void setIva(double iva){
        this.iva = iva;
    }
    public double getIva(){
       return this.iva;
    }

    // set y get del atributo altura
    public void setAltura(double altura){
        this.altura= altura;
    }
    public double getAltura(){
        return altura;
    }

    public void calcularArea(double base){
        //logica de calcular
        System.out.println("El area es:" + (this.baseM + basemenor * this.altura) / 2);
    }
}
