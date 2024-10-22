package ejercicios.ejercicio1;

import java.util.LinkedList;

public class Ej1<T> {

    private LinkedList<T> elementos;

    public Ej1() {
        this.elementos = new LinkedList<>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T extraer() {
        return elementos.pollFirst();
    }

    public T primero() {
        return elementos.peekFirst();
    }

    public void aniadir(T elemento) {
        elementos.addFirst(elemento);
    }

    @Override
    public String toString() {
        return "Pila{" + "elementos=" + elementos + '}';
    }

    public static void main(String[] args) {
        Ej1<String> pila = new Ej1<String>();
        pila.aniadir("Uno");
        pila.aniadir("Dos");
        pila.aniadir("Tres");

        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila.primero());
        System.out.println(pila);
    }
}