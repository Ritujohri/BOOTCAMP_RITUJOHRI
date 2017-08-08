package Lambda;

/**
 * Created by johrir on 7/28/2017.
 */
public class CalculatorServices {
    public static void show(double no1, double no2, CalculatorI calculator){
        calculator.calculate(no1,no2);
    }
}
