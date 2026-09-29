package Colecciones;

public class Curso {
    private String codigo;
    private String nombre;
    private int anio; // usamos anio para evitar problemas con la ñ

    public Curso(String codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    // Getters convencionales
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getAnio() { return anio; }
}
