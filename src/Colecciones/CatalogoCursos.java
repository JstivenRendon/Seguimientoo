package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

public class CatalogoCursos {
    private ArrayList<Curso> listaCursos;

    public CatalogoCursos() {
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        this.listaCursos.add(c);
    }

    // Filtra los cursos por año usando solo Iterator
    public ArrayList<Curso> buscarPorAnio(int anioObjetivo) {
        ArrayList<Curso> filtrados = new ArrayList<>();
        Iterator<Curso> it = this.listaCursos.iterator();

        while (it.hasNext()) {
            Curso actual = it.next();
            // Si el año coincide, lo agregamos a la nueva lista
            if (actual.getAnio() == anioObjetivo) {
                filtrados.add(actual);
            }
        }
        return filtrados;
    }

    // Ordena por codigo usando un Comparator normal
    public void ordenarPorCodigo() {
        this.listaCursos.sort(new Comparator<Curso>() {
            @Override
            public int compare(Curso c1, Curso c2) {
                return c1.getCodigo().compareTo(c2.getCodigo());
            }
        });
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }
}
