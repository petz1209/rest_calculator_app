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
    @GetMapping("/minus")
    public int getMinus(@RequestParam int a, @RequestParam int b){return calc.minus(a, b);}
    @GetMapping("/multiply")
    public int getMultiply(@RequestParam int a, @RequestParam int b){return calc.multiply(a, b);}
    @GetMapping("/divide")
    public double getDivide(@RequestParam double a, @RequestParam double b){return calc.divide(a, b);}
}
