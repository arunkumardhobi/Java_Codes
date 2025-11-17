//Find the kth smallest element in an array.


public class Week3_35 {
    public static void main(String[] args) {
        // creat a object of Comman calss
        Common obj = new Common();
        // this is method that i write in common file to get input from user
        int a[] = Common.getInputFromUser();
     
        int k = Common.getArrayElementFromUser();

        obj.ascendingOrderSorting(a);
        // Print the kth smallest element
        System.out.println(k + "th smallest element is: " + a[k - 1]);

    }
}
