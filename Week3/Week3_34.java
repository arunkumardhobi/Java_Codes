//Find the kth largest element in an array.

public class Week3_34 {
    public static void main(String[] args) {
        // creat a object of Comman calss
        Common obj = new Common();
        // this is method that i write in common file to get input from user
        int a[] = Common.getInputFromUser();

        int k = Common.getArrayElementFromUser();

        obj.ascendingOrderSorting(Common.getInputFromUser());

        System.out.println(k + "th leargest element is :" + a[a.length - k]);

    }
}
