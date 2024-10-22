package ejercicios.ejercicio5;

public class MainEj5 {

    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>();
        pila.aniadir("Uno");
        pila.aniadir("Dos");
        pila.aniadir("Tres");

        System.out.println("Pila: " + pila);
        System.out.println("Extraído: " + pila.extraer());
        System.out.println("Primero: " + pila.primero());
        System.out.println("Pila después de extraer: " + pila);
    }
}