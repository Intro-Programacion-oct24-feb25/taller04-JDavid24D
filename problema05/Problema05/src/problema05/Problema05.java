/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombresC;
        double netflix;
        double youtubeP;
        double dropbox;
        double spotify;
        double promo1;
        double promo2;
        double valorT_mes;
        
        System.out.println("Ingrese el nombre completo");
        nombresC = entrada.nextLine();
        System.out.println("Ingrese el valor de netflix mensual a pagar");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor de youtube premium mensual "
                + "a pagar");
        youtubeP = entrada.nextDouble();
        System.out.println("Ingrese el valor de dropbox mensual a pagar");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor de spotify mensual a pegar");
        spotify = entrada.nextDouble();
        
        promo1 = (netflix + youtubeP) * 0.23;
        promo2 = dropbox * 0.45;
        valorT_mes = promo1 + promo2 +spotify;
        
        System.out.printf("Reporte:\nNombres completos: %s\nValores a pagar:\n"
                + "Promocion 1(netflix y youtubeP): $%.2f\n"
                + "Promocion 2(dropbox): $%.2f\nSpotify: $%.2f\n"
                + "Valor total a pagar: $%.2f\n",
                nombresC,
                promo1,
                promo2,
                spotify,
                valorT_mes);
                
                
                
                
                
                
            
    }
    
}
