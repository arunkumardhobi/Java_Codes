import java.util.Scanner;

public class Week1_7{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=sc.nextInt();
        System.out.println("Enter the number 2");
        int b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("after swapup a="+a);
                  System.out.println("after swapup b="+b);
          
 sc.close();

        
    }
}
