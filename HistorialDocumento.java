import java.util.Stack;

public class HistorialDocumento {
    
    private Stack<Documento> historial;

    public HistorialDocumento() {
        this.historial = new Stack<>();
    }

  
    public void visitarDocumento(String nombre, String tipo, String ruta) {
        Documento nuevoDocumento = new Documento(nombre, tipo, ruta);
        historial.push(nuevoDocumento);
        System.out.println("\nDocuemnto agregado con éxito: " + nuevoDocumento.getNombre());
    }

  
    public void retroceder() {
        if (historial.isEmpty()) {
            System.out.println("\nNo hay documento anterior en el historial para retroceder.");
            return;
        }

        
        Documento documentoSaliente = historial.pop();
        System.out.println("\nHas salido de: " + documentoSaliente.getNombre() + " (" + documentoSaliente.getNombre() + ")");

        
        if (!historial.isEmpty()) {
            Documento documentoActual = historial.peek();
            System.out.println("Ahora te encuentras en: " + documentoActual.getNombre() + " (" + documentoActual.getNombre() + ")");
        } else {
            System.out.println("El historial ha quedado vacío. ");
        }
    }

    
    public void verDocumentoActual() {
        if (historial.isEmpty()) {
            System.out.println("\nNo estás en ningun documento actualmente.");
        } else {
            Documento actual = historial.peek();
            System.out.println("\n[Documento Actual]");
            System.out.println(actual);
        }
    }

    
    public void verHistorial() {
        if (historial.isEmpty()) {
            System.out.println("\nEl historial de documentos está vacío.");
            return;
        }

        System.out.println("\n================ HISTORIAL DE DOCUMENTOS ================");
        System.out.println("(Del acceso más reciente al más antiguo)");
        System.out.println("---------------------------------------------------------");
        
        
        int posicion = 1;
        for (int i = historial.size() - 1; i >= 0; i--) {
            Documento doc = historial.get(i);
            System.out.println(posicion + ". " + doc);
            posicion++;
        }
        System.out.println("=========================================================");
    }
}