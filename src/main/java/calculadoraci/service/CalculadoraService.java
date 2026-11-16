package calculadoraci.service;

import org.springframework.stereotype.Service;

@Service
public final class CalculadoraService {

    // Realiza a soma de dois números
    public int somar(final int a, final int b) {
        return a + b;
    }

    // Realiza a subtração de dois números
    public int subtrair(final int a, final int b) {
        return a - b;
    }

    // Realiza a multiplicação de dois números
    public int multiplicar(final int a, final int b) {
        return a * b;
    }

    // Realiza a divisão de dois números
    public int dividir(final int a, final int b) {

        // Estabelece a condição de que não se pode dividr por zero
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero.");
        }

        return a / b;
    }

}
