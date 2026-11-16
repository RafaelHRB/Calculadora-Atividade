// Pacote que contém os controladores
package calculadoraci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculadoraci.service.CalculadoraService;
/**
 * Controlador REST para as operações da calculadora.
 */
@RestController
public final class CalculadoraController {

    /** Instância do serviço de calculadora. */
    private final CalculadoraService calculadoraService;
    /**
     * Construtor da classe.
     *
     * @param serviceParam serviço de calculadora injetado
     */
    public CalculadoraController(final CalculadoraService serviceParam) {
        this.calculadoraService = serviceParam;
    }
    /**
     * Endpoint para somar dois números.
     */
    @GetMapping("/somar")
    public int somar(@RequestParam int a,
                     @RequestParam int b) {

        return calculadoraService.somar(a, b);
    }
    /**
     * Endpoint para subtrair dois números.
     */
    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int a,
                        @RequestParam int b) {

        return calculadoraService.subtrair(a, b);
    }
    /**
     * Endpoint para multiplicar dois números.
     */
    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a,
                           @RequestParam int b) {

        return calculadoraService.multiplicar(a, b);
    }
    /**
     * Endpoint para dividir dois números.
     */
    @GetMapping("/dividir")
    public int dividir(@RequestParam int a,
                       @RequestParam int b) {

        return calculadoraService.dividir(a, b);
    }

}
