package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n>99 && n>1000) System.out.println("3 Digit number");
        else System.out.println("Not a 3 Digit Number");
    }
}