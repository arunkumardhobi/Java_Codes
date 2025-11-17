//Write a program that prints "Good Morning," "Good Afternoon," "Good Evening," or "Good Night" based on the current time. 

import java.time.LocalTime;

public class Week1_10 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();  // Get current time
        int hour = time.getHour();        

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }

       
        System.out.println("Current time: " + time.withNano(0));
    }
}
