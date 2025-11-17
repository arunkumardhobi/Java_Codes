//Find the common elements in three sorted arrays.
import java.util.HashSet;

public class Week3_50 {
    public static void main(String[] args) {

        Common41_50 common41_50 = new Common41_50();

        HashSet<Integer> common = common41_50.intersection(Common.getInputFromUser(), Common.getInputFromUser(), Common.getInputFromUser());

        System.out.println("Common elements: " + common);
    }
}
