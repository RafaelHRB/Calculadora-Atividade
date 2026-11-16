package calculadoraci;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * Inicializador de Servlet para implantação em servidores de aplicação.
 */
public final class ServletInitializer extends SpringBootServletInitializer {
    /**
     * Configura a aplicação.
     */
    @Override
    protected SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application.sources(CalculadoraCiApplication.class);
    }

}
