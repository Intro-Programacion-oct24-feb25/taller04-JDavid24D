/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nPrimerHijo;
        String nSegundoHijo;
        String nTercerHijo;
        double primerHijo;
        double segundoHijo;
        double tercerHijo;
        double valorTotal;
        
        System.out.println("Ingrese el nombre del primer hijo");
        nPrimerHijo = entrada.nextLine();
        System.out.println("Ingrese el monto que gasto");
        primerHijo = entrada.nextDouble();
        System.out.println("Ingrese el nombre del segundo hijo");
        entrada.nextLine();
        nSegundoHijo = entrada.nextLine();
        System.out.println("Ingrese el monto que gasto");
        segundoHijo = entrada.nextDouble();
        System.out.println("Ingrese el nombre del tercer hijo");
        entrada.nextLine();
        nTercerHijo = entrada.nextLine();
        System.out.println("Ingrese el monto que gasto");
        tercerHijo = entrada.nextDouble();
        
        valorTotal = (primerHijo + segundoHijo + tercerHijo);
        System.out.println("El gasto total de los 3 hijos es:" + valorTotal);
    }
    
}
