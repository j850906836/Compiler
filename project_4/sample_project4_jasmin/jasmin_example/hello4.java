import java.util.Scanner;

public class hello4{
    public static void main(String[] args) {
        String str1;
        int num1;
        double double1;

        System.out.println("Hello! World!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string:");
        str1 = scanner.nextLine();

        System.out.print("Please enter an integer:");
        num1 = scanner.nextInt();

        System.out.print("Please enter a floating point:");
        double1 = scanner.nextDouble();

        System.out.println("The string is: " + str1);
        System.out.println("The integer is: " + num1);
        System.out.println("The floating-point is: " + double1);
    }
}

