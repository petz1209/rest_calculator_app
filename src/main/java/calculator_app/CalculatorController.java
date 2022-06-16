package calculator_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calc = new Calculator();

    @GetMapping("/sum")
    public int getSum(@RequestParam int a, @RequestParam int b){
        return calc.sum(a, b);
    }
}
