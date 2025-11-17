//Write a program to show the difference between public
 //and protected members when accessed from different packages.



public class Week2_27 {
    public static void main(String[] args) {
        com.Demo_26 obj=new com.Demo_26();
        obj.add();
        //obj.display();//this method is protected so that it can not access
    }
    
}
