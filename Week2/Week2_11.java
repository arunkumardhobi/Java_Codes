//Demonstrate the difference between equals() and == operator.
public class Week2_11 {
    public static void main(String[] args) {
        String s1 = "arun";
        String s2 = "arun";
        String s3 = new String("arun");
        boolean b1 = s1 == s2;
        boolean b2 = s1 == s3;//false becuse == check the refrence 
        boolean b3 = s1.equals(s2);
        boolean b4 = s1.equals(s3);//true becouse equel check the value 
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}
