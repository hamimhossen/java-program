class test {
  String name, gender;
  int id;

  void SetInformation(String n, String g, int i){
    name = n;
    gender = g;
    id = i;
  }

  void DisplayInformation(){
    System.out.println("My name is: "+name);
    System.out.println("My gender is: "+gender);
    System.out.println("My id is: "+id);
    System.out.println();

  }
}
public class ParametarizedMethod{
  public static void main(String[] args){

    test obj1 = new test();
    obj1.SetInformation("Hamim", "Male", 172);
    System.out.println("First student information:");
    obj1.DisplayInformation();

    test obj2 = new test();
    obj2.SetInformation("Sara", "Female", 200);
    System.out.println("Second student information:");
    obj2.DisplayInformation();
   
    
  }
} 
