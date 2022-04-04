/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author claussy
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1 = 10;
        double n2 = 5;

        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();

        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();

        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();

        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
    }
    
}
