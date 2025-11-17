//Check if an array contains a specific value.



public class Week3_7{
    public static void main(String[] args) {
        
       //creat a object of Comman calss
     
        //this is method that i write in common file to get input from user
         int[] arr = Common.getInputFromUser();
         System.out.println("Enter the pecific value");
      int a= Common.getArrayElementFromUser();
     Common.checkElementInArray(a, arr);




    }

}