//Create a Byte array from a String and convert it back to a String.

public class Week2_9 {
    public static void main(String[] args) {
        String str="arun";
      byte[] bytes = str.getBytes();
      String str1 = new String(bytes);
      System.out.println(bytes);
      System.out.println(str1);
        
    }
}
