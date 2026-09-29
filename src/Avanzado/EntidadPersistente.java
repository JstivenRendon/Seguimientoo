package Avanzado;


public class EntidadPersistente<T extends Number & Comparable<T>> {
    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    // comparar el valor guardado con otro objeto del mismo tipo
    public int compararCon(T otroObjeto) {
        return this.valor.compareTo(otroObjeto);
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
