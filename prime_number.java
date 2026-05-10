import java.util.Scanner;
public class prime_number {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int num;
    System.out.print("Enter any number: ");
    num = input.nextInt();
    int count = 0;
    for(int i=2; i<num; i++){
      if(num % i == 0){
        count++;
        break;
      }
    }
    if(count == 0){
      System.out.println("The number is prime");
    }
    else{
      System.out.println("The number is not prime");
    }
  }
  
}
