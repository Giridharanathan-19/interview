import java.util.*;

class Divisor {
    public void printDivisors(int num1, int num2) {
        int n1 = num1;
        int n2 = num2;
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        int gcd = n1;
        
        System.out.println("All common divisors:");
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Biggest common divisor: " + gcd);
    }

    public static void main(String[] args) {
        Divisor d = new Divisor();
        d.printDivisors(12, 18);
    }
}