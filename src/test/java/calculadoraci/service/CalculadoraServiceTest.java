package calculadoraci.service;

import org.junit.jupiter.api.Test;

import calculadoraci.service.CalculadoraService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraServiceTest {

    // Instância do serviço de calculadora
    private final CalculadoraService service = new CalculadoraService();

    @Test
    void deveSomar() {
        final int valorA = 5;
        final int valorB = 3;
        final int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, service.somar(valorA, valorB));
    }

    @Test
    void deveSomarNumerosNegativos() {
        final int valorA = -2;
        final int valorB = 5;
        final int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, service.somar(valorA, valorB));
    }

    @Test
    void deveSubtrair() {
        final int valorA = 8;
        final int valorB = 3;
        final int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, service.subtrair(valorA, valorB));
    }

    @Test
    void deveMultiplicar() {
        final int valorA = 4;
        final int valorB = 6;
        final int resultadoEsperado = 24;
        assertEquals(resultadoEsperado, service.multiplicar(valorA, valorB));
    }

    @Test
    void deveMultiplicarPorZero() {
        final int valorA = 15;
        final int valorB = 0;
        final int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, service.multiplicar(valorA, valorB));
    }

    @Test
    void deveDividir() {
        final int valorA = 10;
        final int valorB = 2;
        final int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, service.dividir(valorA, valorB));
    }

    @Test
    void deveSomarComZero() {
        final int valorA = 9;
        final int valorB = 0;
        final int resultadoEsperado = 9;
        assertEquals(resultadoEsperado, service.somar(valorA, valorB));
    }

    @Test
    void naoPermiteDivisaoPorZero() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.dividir(5, 0)
        );

    }

}
