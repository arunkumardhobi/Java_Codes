// Write a program to create an object using the new keyword 
// and another object using a parameterized constructor.
public class Week2_33 {
    String name;
    int age;
//this is defult constructore
 Week2_33(){
     name="arun";
     age=21;
    
  }
  //prameter constructore
  Week2_33(String name, int age){
    this.name=name;
     this.age=age;

 
  }
  void display(){
       System.out.println("name:"+name+" "+"age:"+age);
  }
  public static void main(String[] args) {
    Week2_33 obj=new Week2_33();
    obj.display();
    Week2_33 obj2=new Week2_33("avnish", 25);
    obj2.display();

    
  }
    
}
