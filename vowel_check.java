import java.util.Scanner;
public class vowel_check {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    char ch;

    System.out.print("Enter any character: ");
    ch = input.next().charAt(0);

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u' || 
       ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

         System.out.println("Vowel");
       }

       else{
        System.out.println("Consonant");
       }

      

      
  }
  
}
