//Find the missing number in an array of 1 to n.

public class Week3_31 {

    public static void main(String[] args) {
        // creat a object of Comman calss
        Common obj = new Common();

        int a[] = Common.getInputFromUser();
        int sum = obj.sumOfArray(Common.getInputFromUser());

        // Total sum of 1 to (n+1)
        int total = ((a.length + 1) * (a.length + 2)) / 2;

        int missingElement = total - sum;
        System.out.println("Missing number is: " + missingElement);

    }
}
