//Create a class with a final variable and attempt to reassign it.
public class Week2_16 {
    final int a=10;
    public static void change(){
        a=20;
    }

    public static void main(String[] args) {
        Week2_16 w=new Week2_16();
        System.out.println(w.a);
        change();
        
    }
}
