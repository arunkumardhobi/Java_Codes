//Write a program to create a static nested class and demonstrate its use.
public class Week2_20 {
      Week2_20(){
        System.out.println("this is wee2_0 constructore");

    }

    static class InnerWeek2_20 {
        InnerWeek2_20(){
            System.out.println("this is inner class InnerWeek2_20 constructore");

               
        }
        void display(){
            System.out.println("this ios normal method in the inner class");
        }
    
        
    }
    void display1(){
        System.out.println("this is normal wee2_20 method");
    }
public static void main(String[] args) {
    Week2_20 obj=new Week2_20();
    InnerWeek2_20 inner=new InnerWeek2_20();
    obj.display1();;
    inner.display();
}
    
}
