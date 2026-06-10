class person{
  String name;
  int id;

  void display_info(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
  }
}
class teacher extends person{
  String dept;

  @Override
  void display_info(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("Department: "+dept);
  }
}
public class method_overriding {
  public static void main(String[] args){
    teacher ob = new teacher();
    ob.name="Hamm";
    ob.id=172;
    ob.dept="CSE";
    ob.display_info();
  }
}
