class A{
  int x = 10;
}
class B extends A{
  int x = 5;

  void display()
  {
    System.out.println(super.x);
    System.out.println(x);
  }
}
public class superkeword {
  public static void main(String[] args){
    B ob = new B();
    ob.display();
  }
  
}
