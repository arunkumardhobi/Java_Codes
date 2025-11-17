// Implement a class with both parameterized and non-parameterized 
// constructors and show their usage.
public class Week2_37 {
    String name;
    int age;

   // non-parameterized constructors
    Week2_37(){
     name="arun";
     age=21;
    
  }
  
  //parameterized constructore
  Week2_37(String name, int age){
    this.name=name;
     this.age=age;
  }

    @Override
    public String toString() {
        return "Week2_37 [name=" + name + ", age=" + age + "]";
    }
    public static void main(String[] args) {
        Week2_37 obj=new Week2_37();// in non parameterized construct it use the defult value we can no assign dynamic value
          System.out.println(obj);
        Week2_37 obj1=new Week2_37("avnish", 25);//assign dynamic value
    System.out.println(obj1);
    }
}
