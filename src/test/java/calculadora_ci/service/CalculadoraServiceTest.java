package calculadora_ci.service;

import org.junit.jupiter.api.Test;

import calculadoraci.service.CalculadoraService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraServiceTest {

    private final CalculadoraService service = new CalculadoraService();

    @Test
    void deveSomar() { 
        final int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, service.somar(5, 3));
    }

    @Test
    void deveSomarNumerosNegativos() {
        final int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, service.somar(-2, 5));
    }

    @Test
    void deveSubtrair() {
        final int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, service.subtrair(8, 3));
    }

    @Test
    void deveMultiplicar() {
        final int resultadoEsperado = 24;
        assertEquals(resultadoEsperado, service.multiplicar(4, 6));
    }

    @Test
    void deveMultiplicarPorZero() {
        final int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, service.multiplicar(15, 0));
    }

    @Test
    void deveDividir() {
        final int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, service.dividir(10, 2));
    }

    @Test
    void deveSomarComZero() {
        final int resultadoEsperado = 9;
        assertEquals(resultadoEsperado, service.somar(9, 0));
    }

    @Test
    void naoPermiteDivisaoPorZero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.dividir(5, 0)
        );

    }

}
