package ejercicios.ejercicio2;

import java.util.Arrays;

public class Ej2<T> {

    public static void main(String[] args) {
        Ej2<String> pila = new Ej2<>(3);
        pila.aniadir("Uno");
        pila.aniadir("Dos");
        pila.aniadir("Tres");

        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila.primero());
        System.out.println(pila);
    }

    private T[] elementos;
    private int contador;


    public Ej2(int capacidad) {
        this.elementos = (T[]) new Object[capacidad];
        this.contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public T extraer() {
        if (estaVacia()) {
            System.out.println("La Pila esta vacia");
        }
        T elemento = elementos[--contador];
        T[] nuevoArray = Arrays.copyOf(elementos, contador);
        elementos = nuevoArray;
        return elemento;
    }

    public T primero() {
        if (estaVacia()) {
            System.out.println("La Pila esta vacia");
        }
        return elementos[contador - 1];
    }

    public void aniadir(T elemento) {
        if (contador == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[contador++] = elemento;
    }

    @Override
    public String toString() {
        return "PilaArray{" + "elementos=" + Arrays.toString(elementos) + ", contador=" + contador + '}';
    }
}