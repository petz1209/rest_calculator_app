package calculator_app;

// Holds business Logic of calculation
public class Calculator {
    public int sum(int a, int b){
        return a +b;
    }
    public int minus(int a, int b){return a - b;}
    public int multiply(int a, int b){return a*b;}
    public double divide(double a, double b){
        if(b == 0.0){
            return 0.0;
        }
        return a/b;}
}
