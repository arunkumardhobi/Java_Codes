// Write a class with a default access modifier and demonstrate its 
// accessibility within the same package.
class DefoultAccessModifire {
    void defoultMethod() {
        System.out.println("this is defoult method ");
    }

    public static void main(String[] args) {
        DefoultAccessModifire obj = new DefoultAccessModifire();
        obj.defoultMethod();// accessible only within same packege

    }

}

public class Week2_30 {
    public static void main(String[] args) {
        DefoultAccessModifire obj = new DefoultAccessModifire();
        obj.defoultMethod();// accessible only within same packege
    }
}
