/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String datCliente;
        String direccion;
        double costoMin;
        double minConsumidos;
        double valorP;
        
        System.out.println("Ingrese el nombre completo");
        datCliente = entrada.nextLine();
        System.out.println("Ingrese la direccion del domicilio");
        direccion = entrada.nextLine();
        System.out.println("Ingrese el costo por minuto");
        costoMin = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos");
        minConsumidos = entrada.nextDouble();
        
        valorP = costoMin * minConsumidos;
        
        System.out.printf("Reporte:\nNombres completos: %s\n Direccion: %s\n"
                +"Costo por minuto: $%.1f\n Numero de minutos consumidos: %.0f\n\t"
                +"Valor a cancelar: $%.0f\n",
                datCliente,
                direccion,
                costoMin,
                minConsumidos,
                valorP);
        
                
            
        
                
        
    }
    
}
n