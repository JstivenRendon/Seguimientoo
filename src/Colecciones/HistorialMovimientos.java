package Colecciones;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class HistorialMovimientos<T> {
    private ArrayDeque<T> movimientos;
    private Predicate<T> condicion;

    // Constructor que recibe la condicion para guardar
    public HistorialMovimientos(Predicate<T> condicion) {
        this.movimientos = new ArrayDeque<>();
        this.condicion = condicion;
    }

    public void agregarMovimiento(T movimiento) {
        this.movimientos.add(movimiento);
    }

    // Busca hasta N elementos usando estrictamente Iterator
    public List<T> obtenerPrimerosN(int n) {
        List<T> resultado = new ArrayList<>();
        Iterator<T> it = this.movimientos.iterator();
        int contador = 0;

        // Se detiene si ya no hay elementos o si ya encontramos los N requeridos
        while (it.hasNext() && contador < n) {
            T actual = it.next();

            // Revisa si cumple la condicion guardada en el constructor
            if (this.condicion.test(actual)) {
                resultado.add(actual);
                contador++; // sumamos uno al contador de encontrados
            }
        }
        return resultado;
    }

    public ArrayDeque<T> getMovimientos() {
        return movimientos;
    }
}
