class test {
  private String name;
  private int id;

  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setId(int i){
    id = i;
  }
  public int getId(){
    return id;
  }
  
}
public class encapsulation{
  public static void main(String[] args){

    test ob1 = new test();
    ob1.setName("Jeri");
    ob1.setId(100);
    System.out.println("Name: "+ob1.getName());
    System.out.println("Id: "+ob1.getId());
    System.out.println();

    test ob2 = new test();
    ob2.setName("Sara");
    ob2.setId(222);
    System.out.println("Name: "+ob2.getName());
    System.out.println("Id: "+ob2.getId());
  }
}
