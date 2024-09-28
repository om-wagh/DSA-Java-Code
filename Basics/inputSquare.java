package Basics;
import java.util.Scanner; // agr aapko input lenahe user se to ye line use kre
public class inputSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}
