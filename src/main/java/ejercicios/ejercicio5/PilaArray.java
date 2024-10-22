package ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class PilaArray<T> implements ColeccionSimpleGenerica<T> {

    private List<T> elementos;

    public PilaArray() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public T extraer() {
        if (estaVacia()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    @Override
    public void aniadir(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}