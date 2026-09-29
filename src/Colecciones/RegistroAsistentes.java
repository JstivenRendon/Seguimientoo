package Colecciones;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Comparator;

public class RegistroAsistentes {
    private LinkedList<Asistente> listaAsistentes;

    public RegistroAsistentes() {
        this.listaAsistentes = new LinkedList<>();
    }

    public void agregarAsistente(Asistente a) {
        this.listaAsistentes.add(a);
    }

    // Filtra por la letra inicial usando solo Iterator
    public LinkedList<Asistente> filtrarPorLetraInicial(char letra) {
        LinkedList<Asistente> filtrados = new LinkedList<>();
        Iterator<Asistente> it = this.listaAsistentes.iterator();

        // Convertimos la letra a string y a minuscula para comparar facil
        String letraBuscada = String.valueOf(letra).toLowerCase();

        while (it.hasNext()) {
            Asistente actual = it.next();
            // Si el nombre empieza con esa letra, lo guarda
            if (actual.getNombre().toLowerCase().startsWith(letraBuscada)) {
                filtrados.add(actual);
            }
        }
        return filtrados;
    }

    // Ordena alfabeticamente por nombre usando un Comparator
    public void ordenarPorNombre() {
        this.listaAsistentes.sort(new Comparator<Asistente>() {
            @Override
            public int compare(Asistente a1, Asistente a2) {
                return a1.getNombre().compareTo(a2.getNombre());
            }
        });
    }

    public LinkedList<Asistente> getListaAsistentes() {
        return listaAsistentes;
    }
}
