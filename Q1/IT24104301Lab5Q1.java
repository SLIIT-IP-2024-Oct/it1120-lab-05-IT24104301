import java.util.Scanner;

public class IT24104301Lab5Q1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int integer1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int integer2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int integer3 = input.nextInt();

        System.out.println("\nUser entered numbers are: " + integer1 + " " + integer2 + " " + integer3);

        int smallest = integer1;
        int largest = integer1;

        if (integer2 < smallest) {
            smallest = integer2;
        }
        if (integer2 > largest) {
            largest = integer2;
        }

        if (integer3 < smallest) {
            smallest = integer3;
        }
        if (integer3 > largest) {
            largest = integer3;
        }

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}
