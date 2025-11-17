//Write a program that uses constructor chaining between parent and child classes.
class Demo_36{
    Demo_36(){
        System.out.println("this is constructore Demo");
    }

}
public class Week2_36 extends Demo_36 {
   Week2_36 (){
    super();//calling parent class constructor
        System.out.println("this is constructore");
    }
    public static void main(String[] args) {
        Week2_36 obj=new Week2_36();//call the both constructore parent and child because of super keyword 
        
    }
    
}
