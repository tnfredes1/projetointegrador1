/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador;

import java.util.Scanner;

/**
 *
 * @author tnfre
 */
public class basckara {
    public static void main(String[] args) {
        
        Scanner rapadura = new Scanner (System.in);
        // Entradas
        System.out.println("n1: ");
        double x1 = rapadura.nextDouble();
        System.out.println("n2: ");
        double x2 = rapadura.nextDouble();
        System.out.println("c: ");
        double c = rapadura.nextDouble();
        
        
        //Processamento
        
        double s = x1+x2;
        double p = x1*x2;
        double a = c/p;
        double b = - (a*s);
        
        
       // Saída
        System.out.println(a+"x^2+"+b+"x+"+c+" = 0");
    }
}
