import java.util.Scanner;

public class hello5{
    public static void main(String[] args) {
        int num1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        num1 = scanner.nextInt();

        System.out.println("The integer is: " + num1);
    }
}

