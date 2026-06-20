class shape{
  double area(){
    System.out.print("Shape Area: ");
    return 0;
  }
}
class rectangle extends shape{
  double length, width;
  rectangle(double l, double w){
    length = l;
    width = w;
  }
  @Override
  double area(){
    System.out.print("Rectangle Area: ");
    return length*width;
  }
}
class triangle extends shape{
  double breadth,height;
  triangle(double b, double h){
    breadth = b;
    height = h;
  }
  @Override
  double area(){
    System.out.print("Triangle Area: ");
    return 0.5*breadth*height;
  }
}
public class overriden {
  public static void main(String[] args){

    shape s = new shape();
    rectangle r = new rectangle(5,6);
    triangle t = new triangle(5,10);

    System.out.println( s.area());
    System.out.println(r.area());
    System.out.println(t.area());
  }
}
