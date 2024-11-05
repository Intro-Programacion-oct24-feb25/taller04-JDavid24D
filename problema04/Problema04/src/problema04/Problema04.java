/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreCliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double valorTotal;
        
        System.out.println("Ingrese nombres completos");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        raton = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        pantalla = entrada.nextDouble();
        
        valorTotal = cpu + teclado + raton + pantalla;
        System.out.printf("Reporte:\nNombre de Cliente: %s\nValores iniciales:"
                + "\nCPU: $ %.0f\nTeclado: $ %.0f\nRaton: $ %.0f\n"
                + "Pantalla: $ %.0f\n\n\nValor a cancelar: $%.0f\n",
                nombreCliente,
                cpu,
                teclado,
                raton,
                pantalla,
                valorTotal);
    }
    
}
