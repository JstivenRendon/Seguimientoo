package Colecciones;

// Orden natural por documento
public class Asistente implements Comparable<Asistente> {
    private String documento;
    private String nombre;

    public Asistente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Asistente otro) {
        // Compara los strings de los documentos
        return this.documento.compareTo(otro.documento);
    }

    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
}
