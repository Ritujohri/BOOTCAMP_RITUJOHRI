package Lambda;

/**
 * Created by johrir on 7/28/2017.
 */
public class CalculateTest {
    public static void main(String[] args) {
        CalculatorServices.show(12.5, 45.78,(double d1,double d2) -> {
            System.out.printf("Addition : %s%n",(d1 + d2));
        });
        CalculatorServices.show(12.5, 45.78,(double d1,double d2) -> {
            System.out.printf("Subtraction : %s%n",(d1 - d2));
        });
        CalculatorServices.show(12.5, 45.78,(double d1,double d2) -> {
            System.out.printf("Multiplication : %s%n",(d1 * d2));
        });
        CalculatorServices.show(12.5, 45.78,(double d1,double d2) -> {
            System.out.printf("Division : %s%n",(d1 / d2));
        });
    }
}
