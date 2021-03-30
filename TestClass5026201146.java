import java.util.*;
import java.lang.*;

public class TestClass5026201146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComputeMethods5026201146 result = new ComputeMethods5026201146();
        System.out.print("Input degree in fahrenheit : ");
        double suhu = sc.nextDouble();
        System.out.print("Input base of the triangle : ");
        int base = sc.nextInt();
        System.out.print("Input the height of the triangle : ");
        int height = sc.nextInt();
        result.fT0C(suhu);
        result.hypotenuse(base, height);
        result.roll();


    }
}