package calculadoraci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraCiApplication {

    private CalculadoraCiApplication() { }

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraCiApplication.class, args);
    }

}
