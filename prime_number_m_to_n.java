import java.util.Scanner;
public class prime_number_m_to_n {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int m, n, count=0, total_prime=0;
    System.out.print("Enter initial number: ");
    m = input.nextInt();

    System.out.print("Enter last number: ");
    n = input.nextInt();

    for(int i=m; i<=n; i++){
      for(int j=2; j<i; j++){
        if(i % j == 0){
          count++;
          break;
        }
      }
      if(count == 0){
        System.out.println(i);
        total_prime++;
      }
      count = 0;
    }
    System.out.println("Total prime numbers: "+total_prime);

  }
  
}
