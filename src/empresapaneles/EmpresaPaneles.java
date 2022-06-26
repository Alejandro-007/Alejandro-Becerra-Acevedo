
/* 
    ALEJANDRO BECERRA ACEVEDO
*/

package empresapaneles;

import java.util.ArrayList;
import java.util.Scanner;


public class EmpresaPaneles {

    static ArrayList<Panel> panel = new ArrayList();
    static ArrayList<Venta> venta = new ArrayList();
    static ArrayList<Seguro> seguro = new ArrayList();
    
    public static void main(String[] args) {
        Panel auxPanel = new Panel();
        Venta auxVenta = new Venta();
        Seguro auxSeguro = new Seguro();
        
        Scanner leer = new Scanner(System.in);

        int sw = 1;        
        while (sw > 0 && sw < 7){

            System.out.println(MenuPrincipal());
            sw = leer.nextInt();

            switch(sw) {
                case 1 -> panel.add(auxPanel.IngresarDatos());
                case 2 -> venta.add(auxVenta.IngresarDatos());
                case 3 -> seguro.add(auxSeguro.IngresarDatos());
                case 4 -> mostrarDato(panel);
                case 5 -> mostrarDato(venta);
                case 6 -> mostrarDato(seguro);
                default -> System.out.println("Se termino el programa por la seleccion gracias y hasta la proxima");
            }
        }
    }  
    public static String MenuPrincipal() {
        return  "\n\n** MENU PRINCIPAL**\n\n"
               + "1. Ingresar Panel\n"
               + "2. Ingresr Venta\n"
               + "3. Ingresar Seguro\n"
               + "4. Visualizar todos los paneles\n"
               + "5. Visualizar las ventas realizadas\n"
               + "6. Visualizar todos los seguros\n"
               + "7. Terminar\n"                   ;
        
    }//Fin del menú principal    
    public static void mostrarDato(ArrayList Array){      
        for(int i = 0; i< Array.size(); i++){
            System.out.println(Array.get(i));  //se invoca el método toString de las clases
        }
    }
}
