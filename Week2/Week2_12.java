//Create a class with a static counter variable 
//that tracks the number of instances created.

class counter {
    static int count = 0;

    counter() {
        count++;

    }

    public void desplay() {
        System.out.println(count);
    }

}

public class Week2_12 {
    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        counter c4 = new counter();
        counter c5 = new counter();
        c1.desplay();

    }
}
