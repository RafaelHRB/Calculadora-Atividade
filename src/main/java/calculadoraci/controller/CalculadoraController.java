// Pacote que contém os controladores
package calculadoraci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculadoraci.service.CalculadoraService;

@RestController
public final class CalculadoraController {

    // Instância do serviço de calculadora
    private final CalculadoraService calculadoraService;

    public CalculadoraController(final CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/somar")
    public int somar(@RequestParam int a,
                     @RequestParam int b) {

        return calculadoraService.somar(a, b);
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam int a,
                        @RequestParam int b) {

        return calculadoraService.subtrair(a, b);
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a,
                           @RequestParam int b) {

        return calculadoraService.multiplicar(a, b);
    }

    @GetMapping("/dividir")
    public int dividir(@RequestParam int a,
                       @RequestParam int b) {

        return calculadoraService.dividir(a, b);
    }

}
