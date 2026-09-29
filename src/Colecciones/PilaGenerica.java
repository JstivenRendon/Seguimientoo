package Colecciones;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PilaGenerica<T> {
    private LinkedList<T> elementos;

    public PilaGenerica() {
        this.elementos = new LinkedList<>();
    }

    // Metodos normales de una pila (push y pop)
    public void apilar(T elemento) {
        this.elementos.addFirst(elemento);
    }

    public T desapilar() {
        if (elementos.isEmpty()) {
            return null;
        }
        return this.elementos.removeFirst();
    }

    // Metodo solicitado: busca elementos sin alterar la pila usando Iterator
    public List<T> extraerSi(Predicate<T> p, int max) {
        List<T> resultado = new ArrayList<>();
        Iterator<T> it = this.elementos.iterator();
        int contador = 0;

        // Recorremos con el ciclo while tradicional sin modificar la lista original
        while (it.hasNext() && contador < max) {
            T actual = it.next();

            // Si cumple la condicion pasada por parametro
            if (p.test(actual)) {
                resultado.add(actual);
                contador++;
            }
        }
        return resultado;
    }

    public LinkedList<T> getElementos() {
        return elementos;
    }
}
