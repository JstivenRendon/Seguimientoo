package Intermedio;

public class CajaNumerica<T extends Number> {
    private T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    public double doble() {
        return this.numero.doubleValue() * 2;
    }

    public T getNumero() {
        return numero;
    }
}
