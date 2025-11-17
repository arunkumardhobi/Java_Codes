import java.util.Scanner;

public class Week1_4 {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a=sc.nextInt();
        System.out.println("Enter the number 2");
        int b=sc.nextInt();
          System.out.println("Enter the number 3");
          int c=sc.nextInt();
          float avg=(a+b+c)/3;
            System.out.println("avarage of three number is "+avg);

 sc.close();
        
    }
}
