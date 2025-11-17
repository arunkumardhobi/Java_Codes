// Create a class hierarchy and demonstrate access modifier 
// inheritance with overridden methods.

// Base class (Parent)
class Animal {
    // Private method — not inherited
    private void privateSound() {
        System.out.println("Animal makes a private sound");
    }

    // Protected method — can be inherited
    protected void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Public method — can be inherited and overridden
    public void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class (Child)
class Dog extends Animal {
    // Overriding protected method — can keep it protected or make it more accessible (public)
    @Override
    public void makeSound() {  // Changed from protected → public (allowed)
        System.out.println("Dog barks");
    }

    // Overriding public method — must remain public (cannot reduce visibility)
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Another subclass to show access differences
class Puppy extends Dog {
    @Override
    public void makeSound() {
        System.out.println("Puppy yips");
    }
}

// Main class to test behavior
public class Week2_31 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();           // Animal eats food
        // a.makeSound();  // Not accessible if called outside package unless in subclass

        Dog d = new Dog();
        d.makeSound();     // Dog barks
        d.eat();           // Dog eats bones

        Puppy p = new Puppy();
        p.makeSound();     // Puppy yips
        p.eat();           // Dog eats bones (inherited from Dog)
    }
}
