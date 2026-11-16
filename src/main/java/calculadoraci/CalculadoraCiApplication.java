package calculadoraci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Classe principal de inicialização da aplicação Spring Boot.
 */
@SpringBootApplication
public final class CalculadoraCiApplication {
    /**
     * Construtor privado para ocultar o construtor público implícito.
     */
    private CalculadoraCiApplication() { }
    /**
     * Método principal.
     *
     * @param args argumentos de linha de comando
     */
    public static void main(final String[] args) {
        SpringApplication.run(CalculadoraCiApplication.class, args);
    }

}
