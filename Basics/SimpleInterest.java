package Basics;
public class SimpleInterest {
    public static void main(String[] args) {
        double p = 2000; // principal
        double r = 3.75; // rate
        double t = 3.5; // time
        double si = p*r*t/100; // simple interest
        System.out.println(si);
    }
}