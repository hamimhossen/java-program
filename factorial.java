import java.util.Scanner;
public class factorial {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int n, fact = 1;
    System.out.print("Enter any inter number: ");
    n = input.nextInt();

    for(int i=1; i<=n; i++){
      fact = fact * i;
    }
    System.out.println("The factorial is: "+fact);
  }
  
}
