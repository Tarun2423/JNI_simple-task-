import java.util.*;
public class CircleCalculator {

    static {
        System.load("C:\\Users\\ADMIN\\Documents\\Task-JNI\\CircleCalculator.dll");

    }

    private native double calculateAreaOfCircle(int radius) throws NativeCalculationException;

    public static void main(String[] args) {
        CircleCalculator calculator = new CircleCalculator();
        Scanner sc=new Scanner(System.in);
        try {
            int radius = sc.nextInt();  
            double area = calculator.calculateAreaOfCircle(radius);
            System.out.println("Area of circle with radius " + radius + ": " + area);
        } catch (NativeCalculationException e) {
            System.err.println("Caught exception in Java code: " + e.getMessage());
        }
    }
}
