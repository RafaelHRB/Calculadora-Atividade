package calculadoraci.service;

import org.springframework.stereotype.Service;
/**
 * Serviço que contém a lógica de negócios da calculadora.
 */
@Service
public final class CalculadoraService {

    /**
     * Realiza a soma de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da soma
     */
    public int somar(final int a, final int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da subtração
     */
    public int subtrair(final int a, final int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da multiplicação
     */
    public int multiplicar(final int a, final int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão
     * @throws IllegalArgumentException se o divisor for zero
     */
    public int dividir(final int a, final int b) {

        // Estabelece a condição de que não se pode dividir por zero
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero.");
        }

        return a / b;
    }

}
