//Demonstrate the use of this() to call one constructor from another in the same class.
public class Week2_34 {
      String name;
    int age;
//this is defult constructore
 Week2_34(){
     name="arun";
     age=21;
    
  }
  //prameterized constructore
  Week2_34(String name, int age){
    this.name=name;
     this.age=age;

 
  }
  @Override
public String toString() {
    return "Week2_34 [name=" + name + ", age=" + age + "]";
}
  public static void main(String[] args) {
    Week2_34 obj=new Week2_34();
    System.out.println(obj);//defult constructore
    Week2_34 obj2=new Week2_34("avnish", 25);
    System.out.println(obj2);//prameter constructore

    
  }
    
}
