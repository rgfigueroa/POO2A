/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherenciapoo;

/**
 *
 * @author roberth
 */
public class FigurasHerenciaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa de figuras");
        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        
//        cuadrado.areaCuadrado(4);
//        
//        triangulo.areaTriangulo(3, 2);
//        
//        cuadrado.areaTriangulo(4,3);
        cuadrado.area();
        triangulo.area();
        

    }

}
