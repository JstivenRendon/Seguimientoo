package Colecciones;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Comparator;

public class BibliotecaRevistas {
    private LinkedList<Revista> listaRevistas;

    public BibliotecaRevistas() {
        this.listaRevistas = new LinkedList<>();
    }

    public void agregarRevista(Revista r) {
        this.listaRevistas.add(r);
    }

    // Filtra las revistas en un rango de años usando solo Iterator
    public LinkedList<Revista> obtenerPorRangoAnios(int anioInicio, int anioFin) {
        LinkedList<Revista> resultado = new LinkedList<>();
        Iterator<Revista> it = this.listaRevistas.iterator();

        while (it.hasNext()) {
            Revista actual = it.next();
            // Revisa si el año de la revista esta dentro del rango
            if (actual.getAnio() >= anioInicio && actual.getAnio() <= anioFin) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    // Ordenamiento combinado solicitado por el profe
    public void ordenarPorCriterioEspecial() {
        this.listaRevistas.sort(new Comparator<Revista>() {
            @Override
            public int compare(Revista r1, Revista r2) {
                // 1. Primero compara por año asc
                int compAnio = Integer.compare(r1.getAnio(), r2.getAnio());
                if (compAnio != 0) {
                    return compAnio;
                }

                // 2. Si empatan en año, compara por mes asc
                int compMes = Integer.compare(r1.getMes(), r2.getMes());
                if (compMes != 0) {
                    return compMes;
                }

                // 3. Si empatan en todo, desempata por titulo alfabeticamente
                return r1.getTitulo().compareTo(r2.getTitulo());
            }
        });
    }

    public LinkedList<Revista> getListaRevistas() {
        return listaRevistas;
    }
}
