public class Main {
    static void checkAge(int age) {
        
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
        else{
            System.err.println("ange is grater trhen 18");
        }
    }

    public static void main(String[] args) {
        
        checkAge(16);
    }
}