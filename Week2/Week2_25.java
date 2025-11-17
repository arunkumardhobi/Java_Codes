//Implement a class with a private constructor and use a
//  static method to create an instance of the class.
public class Week2_25 {
    private Week2_25(String s){
        System.out.println(s+"+this is private constructor of Week2_25");
    }
    public static Week2_25 displsy(){
        return new Week2_25("hello");

    }
    public static void main(String[] args) {
        Week2_25.displsy();
    }
}
