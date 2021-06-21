/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocalculadora;

/**
 *
 * @author roberth
 */
public class Calculadora {

    private double numeroUno;
    private double numeroDos;

    public Calculadora(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    /**
     * @return the numeroDos
     */
    public double getNumeroDos() {
        return numeroDos;
    }

    /**
     * @param numeroDos the numeroDos to set
     */
    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    /**
     * Metodo que permite sumar dos digitos
     */
    public void sumar() {
        System.out.println("La suma es:" + (this.numeroUno + this.numeroDos));
    }

    public void restar() {
        System.out.println("La resta es:" + (this.numeroUno - this.numeroDos));

    }

    public void multiplicar() {
        System.out.println("La multiplicacion es:" + (this.numeroUno * this.numeroDos));

    }

    public void dividir() {
        System.out.println("La division es:" + (this.numeroUno / this.numeroDos));
    }

}
