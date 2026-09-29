package Colecciones;


// Implementa Comparable para que se ordene por nombre de forma natural
public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public int compareTo(Contacto otro) {
        // Compara por orden alfabetico del nombre
        return this.nombre.compareTo(otro.nombre);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
}
