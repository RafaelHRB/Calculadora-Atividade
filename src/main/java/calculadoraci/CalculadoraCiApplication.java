package calculadoraci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class CalculadoraCiApplication {

    private CalculadoraCiApplication() { }

    public static void main(final String[] args) {
        SpringApplication.run(CalculadoraCiApplication.class, args);
    }

}
