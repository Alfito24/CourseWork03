import java.util.Scanner;
public class ProcessAName5026201146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name : ");
        String name = sc.nextLine();
        String namaDepan = name.substring(name.indexOf(" ")+1);
        String namaBelakang = name.substring(0, 1);
        String newName = namaDepan + ", " + namaBelakang + ".";
        System.out.println("Your name is " + newName);
    }
}
