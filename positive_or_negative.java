import java.util.Scanner;
public class positive_or_negative {
  static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int num;
    System.out.print("Enter any number: ");
    num = input.nextInt();

    if(num > 0){
      System.out.print("Number is positive");
    }
    else if(num < 0){
      System.out.print("Number is negative");
    }
    else{
      System.out.print("Number is zero");
    }

  }
  
}
