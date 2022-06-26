
/* 
    ALEJANDRO BECERRA ACEVEDO
*/

package empresapaneles;

import java.time.LocalDate;
import java.util.Scanner;

public class Panel {
    private String id;
    private String serie;
    private String descripcion;
    private String tipo;
    private String modelo;
    private int anoFabricacion;
    private Double precio;
    
    Scanner leer = new Scanner (System.in);

    public Panel() {
    }

    public Panel(String id, String serie, String descripcion, String tipo, String modelo, int anoFabricacion, Double precio) {
        this.id = id;
        this.serie = serie;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder listaPanel = new StringBuilder();                                                                   
        listaPanel.append("\nid: ");
        listaPanel.append(id);
        listaPanel.append("\nSerie: ");
        listaPanel.append(serie);
        listaPanel.append("\nDescripcion: ");
        listaPanel.append(descripcion);
        listaPanel.append("\nTipo: ");
        listaPanel.append(tipo);  
        listaPanel.append("\nModelo: ");
        listaPanel.append(modelo);
        listaPanel.append("\nAño Fabricacion: ");
        listaPanel.append(anoFabricacion);
        listaPanel.append("\nPrecio: ");
        listaPanel.append(precio);
        listaPanel.append("\nUso: ");
        listaPanel.append(calcularUso());

        return listaPanel.toString();
    } 
    
    public String calcularUso(){      
        int difernciaAnos;
        String uso;
        difernciaAnos = LocalDate.now().getYear() - anoFabricacion;
        if (difernciaAnos >= 0 && difernciaAnos <= 1){
            uso = "nuevo";            
        }else if(difernciaAnos > 1 && difernciaAnos <= 4){
            uso = "medianamente usado";
        }else if(difernciaAnos > 4){
            uso = "usado";
        }else{
            uso = "Datos no coinciden";
        }
        return uso;
    }    
    public Panel IngresarDatos (){
        
        System.out.println("Ingrese la id: ");
        id= leer.next();
        System.out.println("Ingrese el serie: ");
        serie = leer.next();
        System.out.println ("Ingrese el tipo: ");
        tipo = leer.next();
        System.out.println("Ingrese el modelo: ");
        modelo = leer.next();
        leer.nextLine();
        System.out.println("Ingrese el descripcion: ");
        descripcion = leer.nextLine();
        System.out.println("Ingrese ano de fabricacion");
        anoFabricacion = leer.nextInt();
        System.out.println("Ingrese el precio del panel");
        precio = leer.nextDouble();
        
        Panel panel = new Panel (id, serie, descripcion, tipo, modelo, anoFabricacion, precio);
        return panel;
    }
}
