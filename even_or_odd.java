import java.util.Scanner;
public class even_or_odd {
  static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int num;

    System.out.print("Enter any number: ");
    num = input.nextInt();

    if(num % 2 == 0){
      System.out.println("The number is even");
    }

    else{
      System.out.println("The number is odd");
    }

  }
  
}
