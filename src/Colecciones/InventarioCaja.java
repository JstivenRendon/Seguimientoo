package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class InventarioCaja<T extends Comparable<T>> {
    private ArrayList<T> elementos;

    public InventarioCaja() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
    }


    public List<T> obtenerMayoresQue(T umbral) {
        List<T> resultado = new ArrayList<>();


        Iterator<T> it = this.elementos.iterator();


        while (it.hasNext()) {
            T elementoActual = it.next();


            if (elementoActual.compareTo(umbral) > 0) {
                resultado.add(elementoActual);
            }
        }

        return resultado;
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }
}
