/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherenciapoo;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class Triangulo extends Figura {

    @Override
    public void area() {
        System.out.println("Ingresa datos de triangulo");
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int base=0;
        altura = sc.nextInt();
        base = sc.nextInt();
        
        System.out.println("Calculando area del triangulo" + base * altura / 2);
    }

}
