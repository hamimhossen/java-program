class Person{
  private String name;
  private int id;

  public void set_name(String n){
    name=n;
  }
  public String get_name(){
    return name;
  }
  public void set_id(int i){
    id=i;
  }
  public int get_id(){
    return id;
  } 
}
class Teacher extends Person{
  private String qualification;
  
  public void set_qualification(String q){
    qualification=q;
  }
  public String get_qualification(){
    return qualification;
  }
  void display(){
    System.out.println("Name: "+get_name());
    System.out.println("Id: "+get_id());
    System.out.println("Qualification: "+get_qualification());
    System.out.println();
  }
} 

public class setter_getter {
  public static void main(String[] args){
    Teacher ob = new Teacher();
    ob.set_name("Ham");
    ob.set_id(172);
    ob.set_qualification("B.Sc. in CSE");
    ob.display();

    Teacher obj = new Teacher();
    obj.set_name("Hamm");
    obj.set_id(1172);
    obj.set_qualification("M.Sc. in CSE");
    obj.display();
  }
}
