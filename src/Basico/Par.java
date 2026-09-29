package Basico;

public class Par<T> {
    private T primero;
    private T segundo;

    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public boolean sonIguales() {
        if (this.primero == null) {
            return this.segundo == null;
        }
        return this.primero.equals(this.segundo);
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }
}
