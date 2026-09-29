import Basico.Caja;
import Basico.Par;
import Intermedio.CajaNumerica;
import Colecciones.InventarioCaja;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Probando la caja basica
        Caja<String> c = new Caja<>();
        c.guardar("funciona la caja basica");
        System.out.println(c.obtener());

        // Probando el par basico
        Par<Integer> p = new Par<>(10, 10);
        System.out.println("¿son iguales? " + p.sonIguales());

        // Probando la caja numerica intermedio
        CajaNumerica<Integer> cn = new CajaNumerica<>(25);
        System.out.println("el doble es: " + cn.doble());

        // Probando el inventario de colecciones
        InventarioCaja<Integer> inv = new InventarioCaja<>();
        inv.agregarElemento(5);
        inv.agregarElemento(40);
        inv.agregarElemento(12);

        List<Integer> resultado = inv.obtenerMayoresQue(10);
        System.out.println("mayores que 10: " + resultado);
    }
}

