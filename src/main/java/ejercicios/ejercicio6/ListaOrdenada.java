package ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {

    private List<E> elementos;

    public ListaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    public void add(E o) {
        int i = 0;
        while (i < elementos.size() &&  0 > elementos.get(i).compareTo(o)) {
            i++;
        }
        elementos.add(i, o);
    }

    public E get(int index) {
        return elementos.get(index);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean remove(E o) {
        return elementos.remove(o);
    }

    public int indexOf(E o) {
        return elementos.indexOf(o);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}