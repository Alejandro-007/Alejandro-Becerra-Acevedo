
package empresapaneles;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner leer = new Scanner(System.in);
  
    int sw = 0;

    static ArrayList<Panel> panel = new ArrayList();
    static ArrayList<Venta> venta = new ArrayList();
    static ArrayList<Seguro> seguro = new ArrayList();
    
    
    System.out.println(MenuPpal());
    
    sw = leer.nextInt();

    switch(sw) {
        case 1:
          Panel.ingresarDato();
        break;
        case 2:
          System.out.println("i es uno.");
        break;
        case 3:
          System.out.println("i es dos.");
        break;
        case 4:
          System.out.println("i es tres.");          
        break;
        case 5:
          System.out.println("i es tres.");          
        break;
        case 6:
          System.out.println("i es tres.");          
        break;
        default:
          System.out.println("i es mayor a tres.");
    }
 
    
    
    public static String MenuPpal(){
        return """
               ** MENU PRINCIPAL **

               1. Ingresar Panel
               2. Ingresr Venta
               3. Ingresar Seguro
               4. Visualizar todos los paneles
               5. Visualizar las ventas realizadas
               6. Visualizar todos los seguros
               7. Terminar
               """;
    }//Fin del menú principal
    
    
}
