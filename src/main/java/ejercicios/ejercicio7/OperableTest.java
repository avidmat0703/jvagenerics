package ejercicios.ejercicio7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class OperableTest {

    @Test
    public void testOperable() {
        Operable<Integer> operable = new Operable<>() {
            @Override
            public Integer sumar(Integer otro) {
                return 5 + otro;
            }

            @Override
            public Integer restar(Integer otro) {
                return 5 - otro;
            }

            @Override
            public Integer multiplicar(Integer otro) {
                return 5 * otro;
            }

            @Override
            public Integer dividir(Integer otro) {
                return 5 / otro;
            }
        };


        // Verificar la  resta
        assertEquals((Integer) 2, operable.restar(3));
        // Verificar la multiplicación
        assertEquals((Integer) 15, operable.multiplicar(3));
        // Verificar la división
        assertEquals((Integer) 1, operable.dividir(3));
        // Verificar la suma
        assertEquals(8, (int) operable.sumar(3));
    }
}