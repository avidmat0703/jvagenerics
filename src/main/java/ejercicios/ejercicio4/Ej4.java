package ejercicios.ejercicio4;

import ejercicios.ejercicio3.Ej3;

public class Ej4 {
    public static void main(String[] args) {
        Ej3<Integer> matriz = new Ej3<>(4, 2);

        int value = 1;
        for (int i = 0; i < matriz.filas(); i++) {
            for (int j = 0; j < matriz.columnas(); j++) {
                matriz.set(i, j, value++);
            }
        }

        System.out.println("Matriz:");
        System.out.println(matriz);

        System.out.println("Contenido de la celda en la fila 1, columna 2: " + matriz.get(1, 1));
    }
}