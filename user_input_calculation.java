import java.util.Scanner;
public class user_input_calculation {
  public static void main(String[] args){

    Scanner num = new Scanner(System.in);

    int num1, num2;

    System.out.print("Enter First Number: ");
    num1 = num.nextInt();

    System.out.print("Enter Second Number: ");
    num2 = num.nextInt();

    int sum = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    int div = num1 / num2;
    int mod = num1 % num2;

    System.out.println("Summation = "+sum);
    System.out.println("Subtraction = "+sub);
    System.out.println("Multiplication = "+mul);
    System.out.println("Division = "+div);
    System.out.println("Modulus = "+mod);

  }
  
}
