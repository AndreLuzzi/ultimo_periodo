package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testeSoma() {
        assertEquals(10.0, calc.somar(5, 5));
    }

    @Test
    void testeSubtracao() {
        assertEquals(2.0, calc.subtrair(5, 3));
    }

    @Test
    void testeMultiplicacao() {
        assertEquals(20.0, calc.multiplicar(4, 5));
    }

    @Test
    void testeDivisao() {
        assertEquals(2.0, calc.dividir(10, 5));
    }

    @Test
    void testeDivisaoPorZero() {

        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> calc.dividir(10, 0)
        );

        assertEquals(
            "Não é possível dividir por zero",
            exception.getMessage()
        );
    }
}