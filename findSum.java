import java.util.Scanner;

public class findSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for loop sum of two user input numbers

// Input of first number
System.out.print("Enter the first number: ");
int number1 = scanner.nextInt();

 // Input of second number
 System.out.print("Enter the second number: ");
 double number2 = scanner.nextDouble();

 // Calculate the sum
 double sum = number1 + number2;

 // Output the result
 System.out.println("Your sum total is: " + sum);

 // Close the scanner
 scanner.close();
    }  
}
