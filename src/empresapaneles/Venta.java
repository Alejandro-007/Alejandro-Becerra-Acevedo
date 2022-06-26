
package empresapaneles;


import java.time.*;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;


public class Venta {
    private String id;    
    private String tipoDocumet;
    private int numDocument;
    private String nombreCompleto;
    private Double valoPagar;
    private String descripUso;
    private LocalDate fechaHora;
    
    Scanner leer = new Scanner(System.in);


    public Venta() {
    }

    public Venta(String id, String tipoDocumet, int numDocument, String nombreCompleto, Double valoPagar, String descripUso, LocalDate fechaHora) {
        this.id = id;
        this.tipoDocumet = tipoDocumet;
        this.numDocument = numDocument;
        this.nombreCompleto = nombreCompleto;
        this.valoPagar = valoPagar;
        this.descripUso = descripUso;
        this.fechaHora = fechaHora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDocumet() {
        return tipoDocumet;
    }

    public void setTipoDocumet(String tipoDocumet) {
        this.tipoDocumet = tipoDocumet;
    }

    public int getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(int numDocument) {
        this.numDocument = numDocument;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Double getValoPagar() {
        return valoPagar;
    }

    public void setValoPagar(Double valoPagar) {
        this.valoPagar = valoPagar;
    }

    public String getDescripUso() {
        return descripUso;
    }

    public void setDescripUso(String descripUso) {
        this.descripUso = descripUso;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }
    
   
    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = LocalDate.now();
    }
    
    public int calcularDiasVendido(){
        long diasVendido = DAYS.between(fechaHora, LocalDate.now());
        return Math.toIntExact(diasVendido);
    }
    
    public Venta IngresarDatos (){        
        
        System.out.println("Ingrese la id: ");
        id= leer.next();
        System.out.println("Ingrese la fecha de vendido en este formato Ej:2015-02-20 ");
        fechaHora = LocalDate.parse(leer.next());
        System.out.println("Ingrese el tipo de documento: ");
        tipoDocumet = leer.next();
        System.out.println ("Ingrese el numero de documento: ");
        numDocument = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre completo: ");
        nombreCompleto = leer.nextLine();
        //nombreCompleto = leer.nextLine();
        System.out.println("Ingrese una corta descripcion de uso: ");
        descripUso = leer.nextLine();
        System.out.println("Ingrese el valor a pagar: ");
        valoPagar = leer.nextDouble();
        
        Venta venta = new Venta (id, tipoDocumet,numDocument, nombreCompleto, valoPagar, descripUso,fechaHora);
        return venta;
    }
    
    
    @Override
    public String toString() {
        StringBuilder listaPanel = new StringBuilder();                                                                   
        listaPanel.append("\nid: ");
        listaPanel.append(id);
        listaPanel.append("\nTipo documento: ");
        listaPanel.append(tipoDocumet);
        listaPanel.append("\nNumero de documento: ");
        listaPanel.append(numDocument);
        listaPanel.append("\nNombre Completo: ");
        listaPanel.append(nombreCompleto);  
        listaPanel.append("\nDescripcion de Uso: ");
        listaPanel.append(descripUso);
        listaPanel.append("\nFecha de la venta: ");
        listaPanel.append(fechaHora);
        listaPanel.append("\nValor a Pagar $: ");
        listaPanel.append(valoPagar);
        listaPanel.append("\nDias vendido: ");
        listaPanel.append(calcularDiasVendido());
        
        return listaPanel.toString();
    } 
}
