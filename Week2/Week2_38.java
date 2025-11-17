//Demonstrate the order of execution between static blocks, 
//instance blocks, and constructors.
public class Week2_38 {
    {
       System.out.println("this is instance block ");

    }
    static{
       System.out.println("this is Static block");


    }
    Week2_38(){
        System.out.println("this is constructor");
    }
    public static void main(String[] args) {
        
        Week2_38  obj=new Week2_38();//first static block after that instance and in end constructors


        
    }
}
