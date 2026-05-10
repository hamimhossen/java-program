import java.util.Scanner;
public class multiplication_table {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter any number: ");
    int n = input.nextInt();

    for(int i=1; i<=10; i++){
      System.out.println(n+" x "+i +" = "+n*i);
    }
  }
  
}
