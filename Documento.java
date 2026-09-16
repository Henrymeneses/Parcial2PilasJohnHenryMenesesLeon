import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa el objeto PaginaWeb a ser manipulado en la Pila.
 */
public class Documento {
    private String nombre;
    private String tipo;
    private String ruta;
    private String fechaApertura;

    // Constructor que asigna la fecha y hora actual automáticamente
    
    public Documento(String nombre, String tipo, String ruta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ruta = ruta;
        this.fechaApertura = obtenerFechaYHoraActual();
    }

    // Constructor sobrecargado en caso de querer asignar fecha manual
    public Documento(String nombre, String tipo, String ruta, String fechaApertura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ruta = ruta;
        this.fechaApertura = fechaApertura;
    }

    private String obtenerFechaYHoraActual() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return ahora.format(formato);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaAcceso(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        return "Típo: " + tipo + " | Nombre: " + nombre + " | Ruta: " + ruta +  " | Fecha de apertura: " + fechaApertura;
    }
}

/*•	nombre 
•	tipo 
•	ruta 
•	fechaApertura */
