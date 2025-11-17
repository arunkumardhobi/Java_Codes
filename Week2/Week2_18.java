//Program to implement a Singleton pattern using a private constructor and a static method.
public class Week2_18 {

// Create a private static instance of the class
    private static Week2_18 instance;

    // Make the constructor private to prevent instantiation
    private Week2_18() {
        System.out.println("Singleton instance created.");
    }

    // Provide a public static method to get the single instance
    public static Week2_18 getInstance() {
        if (instance == null) {
            instance = new Week2_18();
        }
        return instance;
    }


    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

  
    public static void main(String[] args) {
        Week2_18 obj1 = Week2_18.getInstance();
        Week2_18 obj2 = Week2_18.getInstance();

        obj1.showMessage();

        // Check if both references point to the same object
        System.out.println("Are both instances same? " + (obj1 == obj2));
    }
}
