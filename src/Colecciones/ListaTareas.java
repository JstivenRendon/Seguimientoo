package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListaTareas<T extends Comparable<T>> implements Iterable<T> {
    private ArrayList<T> tareas;

    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(T tarea) {
        this.tareas.add(tarea);
    }

    // 1. Iterador normal requerido por la interfaz Iterable (va del inicio al final)
    @Override
    public Iterator<T> iterator() {
        return this.tareas.iterator();
    }

    // 2. Iterador inverso como clase interna que va del ultimo al primero
    private class IteradorInverso implements Iterator<T> {
        private int posicionActual = tareas.size() - 1;

        @Override
        public boolean hasNext() {
            // Hay mas elementos mientras no bajemos del indice 0
            return posicionActual >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay mas tareas en orden inverso");
            }
            // Devuelve el elemento y baja una posicion
            return tareas.get(posicionActual--);
        }
    }

    // 3. Metodo solicitado: busca elementos en un rango usando solo el iterador inverso
    public List<T> obtenerRangoInverso(T min, T max) {
        List<T> resultado = new ArrayList<>();

        // Instanciamos nuestro iterador personalizado que creamos arriba
        Iterator<T> itInverso = new IteradorInverso();

        while (itInverso.hasNext()) {
            T actual = itInverso.next();

            // Revisa si el elemento es >= min y <= max usando compareTo
            if (actual.compareTo(min) >= 0 && actual.compareTo(max) <= 0) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public ArrayList<T> getTareas() {
        return tareas;
    }
}
