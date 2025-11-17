//Demonstrate the use of static blocks for initializing static variables.


public class Week2_14 {
    static int num;
   static String mystr;
  static int a=10;
   static{
      num = 97;
      mystr = "Static keyword in Java";
   }
   public static void main(String args[])
   {
      System.out.println("Value of num: "+num);
      System.out.println("Value of mystr: "+mystr);
      System.out.println(a);
  
   }
}
