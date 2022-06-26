
/* 
    ALEJANDRO BECERRA ACEVEDO
*/


package empresapaneles;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;



public class Seguro {
    
    private String id;
    private String nombreSeguro;
    private String descripSeguro;
    private LocalDate fechaHora;
    private LocalDate fechaFinSeguro;
    
    Scanner leer = new Scanner(System.in);

    public Seguro() {
    }

    public Seguro(String id, String nombreSeguro, String descripSeguro, LocalDate fechaHora, LocalDate fechaFinSeguro) {
        this.id = id;
        this.nombreSeguro = nombreSeguro;
        this.descripSeguro = descripSeguro;
        this.fechaHora = fechaHora;
        this.fechaFinSeguro = fechaFinSeguro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getDescripSeguro() {
        return descripSeguro;
    }

    public void setDescripSeguro(String descripSeguro) {
        this.descripSeguro = descripSeguro;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDate getFechaFinSeguro() {
        return fechaFinSeguro;
    }

    public void setFechaFinSeguro(LocalDate fechaFinSeguro) {
        this.fechaFinSeguro = fechaFinSeguro;
    }
    
    public int calcularDiasSeguro(){
        long diasVendido = DAYS.between(fechaHora,fechaFinSeguro);
        return Math.toIntExact(diasVendido);
    }
    
    
    @Override
    public String toString() {
        StringBuilder listaPanel = new StringBuilder();                                                                   
        listaPanel.append("\nid: ");
        listaPanel.append(id);
        listaPanel.append("\nNombre Seguro: ");
        listaPanel.append(nombreSeguro);
        listaPanel.append("\nFecha Inicio de Seguro: ");
        listaPanel.append(fechaHora);
        listaPanel.append("\nFecha fin de Seguro: ");
        listaPanel.append(fechaFinSeguro);  
        listaPanel.append("\nDescripcion Seguro: ");
        listaPanel.append(descripSeguro);
        listaPanel.append("\nDias de cobertura: ");
        listaPanel.append(calcularDiasSeguro());

        return listaPanel.toString();
    } 
    public Seguro IngresarDatos (){
        
        System.out.println("Ingrese el id: ");
        id= leer.next();
        System.out.println("Ingrese el Nombre del seguro: ");
        nombreSeguro = leer.next();
        fechaHora = LocalDate.now();
        System.out.println("Ingrese la fecha en la que finaliza el seguro en este formato Ej:2015-02-20 : ");
        fechaFinSeguro = LocalDate.parse(leer.next());
        System.out.println ("Ingrese la descripción del seguro: ");
        leer.nextLine();
        descripSeguro = leer.nextLine();
        
        Seguro seguro = new Seguro(id, nombreSeguro, descripSeguro, fechaHora, fechaFinSeguro);
        return seguro;
    }
}
