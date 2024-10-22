package ejercicios.ejercicio3;

import java.util.Arrays;

public class Ej3<T> {


    public static void main(String[] args) {
        Ej3<String> matriz = new Ej3<>(3, 3);
        matriz.set(0, 0, "Cero");
        matriz.set(0, 1, "Uno");
        matriz.set(0, 2, "Dos");
        matriz.set(1, 0, "Tres");
        matriz.set(1, 1, "Cuatro");
        matriz.set(1, 2, "Cinco");
        matriz.set(2, 0, "Seis");
        matriz.set(2, 1, "Siete");
        matriz.set(2, 2, "Ocho");

        System.out.println(matriz);
        System.out.println("Elemento en (1, 1): " + matriz.get(1, 1));
        System.out.println("Número de filas: " + matriz.filas());
        System.out.println("Número de columnas: " + matriz.columnas());
    }

    private T[][] elementos;
    private int filas;
    private int columnas;

    // Constructr que recibe por parametro el número de filas y columnas de la matriz

    public Ej3(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.elementos = (T[][]) new Object[filas][columnas];
    }

    //Pos especifica
    public void set(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            elementos[fila][columna] = elemento;
        }
        else {
            System.out.println("Indice fuera de los limites d la matriz");
        }
    }

    //Pos especifica
    public T get(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return elementos[fila][columna];
        }
        else {
            System.out.println("Indice fuera de los limites d la matriz");
            return null;
        }
    }

    public int columnas() {
        return columnas;
    }

    public int filas() {
        return filas;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < filas; i++) {
            result += Arrays.toString(elementos[i]) + "\n";
        }
        return result;
    }
}