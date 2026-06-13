class A{
  void display(){
    System.out.println("Inside class A");
  }
}
class B extends A{
  @Override
  void display(){
    super.display();
    System.out.println("Inside class B");
  }

}
public class superkeword1 {
  public static void main(String[] args){
    B ob = new B();
    ob.display();
  }
}
