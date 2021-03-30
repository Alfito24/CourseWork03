import java.util.*;
import java.lang.*;
public class ComputeMethods5026201146 {

    public double fT0C(double degreesF){
        double celcius;
        System.out.println("Temp in celcius is " + (celcius = (double) 5/9 * (degreesF-32)));
        return celcius;
    }
    public double hypotenuse(int a, int b){
        double sisiMiring;
        System.out.println("Hypotenuse is " + (sisiMiring = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
        return sisiMiring;
    }
    public int roll(){
        Random acak = new Random();
        int dadu1 = acak.nextInt(6) + 1;
        int dadu2 = acak.nextInt(6) + 1;
        int jumlahDadu = dadu1 + dadu2;
        System.out.println("The sum of the dice values is " + jumlahDadu);
       return jumlahDadu;
    }
}
