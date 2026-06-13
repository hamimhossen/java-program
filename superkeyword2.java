class Vehicle{
  String color;
  String model;

  Vehicle(String c, String m){
    color = c;
    model = m;
  }

  void display(){
    System.out.println("Color: "+color);
    System.out.println("Model: "+model);
  }
}
class Car extends Vehicle{
  int weight;

  Car(String c, String m, int w){
    super(c,m);
    weight = w;
  }
  @Override
  void display(){
    super.display();
    System.out.println("Weight: "+weight);
  }
}
public class superkeyword2 {
  public static void main(String[] args){
    Car ob = new Car("White", "Yamaha", 200);
    System.out.println();
    ob.display();
    System.out.println();
  }
}
