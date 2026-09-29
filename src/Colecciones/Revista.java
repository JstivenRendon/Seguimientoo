package Colecciones;

// Orden natural alfabetico por titulo
public class Revista implements Comparable<Revista> {
    private String titulo;
    private int mes;
    private int anio; // usamos anio por la ñ

    public Revista(String titulo, int mes, int anio) {
        this.titulo = titulo;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public int compareTo(Revista otra) {
        return this.titulo.compareTo(otra.titulo);
    }

    // Getters convencionales
    public String getTitulo() { return titulo; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }
}

