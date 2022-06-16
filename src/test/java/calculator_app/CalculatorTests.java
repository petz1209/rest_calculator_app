package calculator_app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    public void testSumOk(){
        Calculator c = new Calculator();
        assertEquals(2, c.sum(1,1));
    }
}
