abstract class Shape{
  double dim1,dim2;
  Shape(double d1, double d2){
    dim1=d1;
    dim2=d2;
  }
  abstract void area();
}
class Rectangle extends Shape{
  Rectangle(double d1, double d2){
    super(d1,d2);
  }
  void area(){
    double result = dim1*dim2;
    System.out.println("Rectangle Area: "+result );
  }
}
class Triangle extends Shape{
  Triangle(double d1, double d2){
    super(d1,d2);
  }
  void area(){
    double result = 0.5*dim1*dim2;
    System.out.println("Triangle Area: "+result);
  }
}
class Circle extends Shape{
  Circle(double r){
    super(r,r);
  }
  void area(){
    double result = 3.1416*dim1*dim2;
    System.out.println("Circle Area: "+result);
  }
}
public class abstraction1 {
  public static void main(String[] args){
    Shape ref;
    
    ref = new Rectangle(5,10);
    ref.area();

    ref = new Triangle(6,10);
    ref.area();

    ref = new Circle(5);
    ref.area();
  }
}
