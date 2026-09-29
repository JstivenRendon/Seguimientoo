package Colecciones;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Comparator;

public class DirectorioContactos {
    private LinkedList<Contacto> listaContactos;

    public DirectorioContactos() {
        this.listaContactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto c) {
        this.listaContactos.add(c);
    }

    // Busca los correos usando solo Iterator como pidio el profe
    public LinkedList<Contacto> buscarPorDominio(String dominio) {
        LinkedList<Contacto> filtrados = new LinkedList<>();
        Iterator<Contacto> it = this.listaContactos.iterator();

        while (it.hasNext()) {
            Contacto actual = it.next();
            // Revisa si el correo termina con el dominio que le pasamos
            if (actual.getEmail().endsWith(dominio)) {
                filtrados.add(actual);
            }
        }
        return filtrados;
    }

    // Ordena la lista por telefono usando un Comparator normal
    public void ordenarPorTelefono() {
        this.listaContactos.sort(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                // Compara los strings de los telefonos
                return c1.getTelefono().compareTo(c2.getTelefono());
            }
        });
    }

    public LinkedList<Contacto> getListaContactos() {
        return listaContactos;
    }
}

