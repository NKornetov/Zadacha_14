
import java.util.Scanner;

public class Zadacha14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        String s = in.nextLine();

        int x =  Integer.parseInt(s);
        
        double y = (double) x;

        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}