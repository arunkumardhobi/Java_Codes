//Write a program to show the difference between a static method and an instance method.
public class Week2_15 {
    public static void display(){
        System.out.println("this is static method to access this method you have to not creat the instance or object of class");
    }
    public void desplay1(){
         System.out.println("this is instance method to access this method you have to  creat the instance or object of class");

    }
    public static void main(String[] args) {
        Week2_15.display();
        Week2_15 w=new Week2_15();
        w.desplay1();
        
    }
    
}
