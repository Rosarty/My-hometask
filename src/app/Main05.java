package app;

public class Main05 {
    static int num;
    static int num1;
    static int sum;
    static int sum1;

    public static void main(String[] args) {
        num = 1;
        num1 = 6;
        sum = 0;
        for (; num <= num1; num++) {
            System.out.println(num + ") Num is " + num + "," + "sum is " + (sum += num));
            sum1 += num;
        }
        System.out.println("\nSum of numbers is " + sum1);
    }
}
