//Create a class with a copy constructor that copies the values from one object to another.

public class Week2_35 {
    String name ;
    int age;
    String email;
   

    Week2_35(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }
    //copy constructor
     Week2_35(Week2_35 obj) {
        this.name = obj.name;
        this.age = obj.age;
        this.email = obj.email;
    }
 
    @Override
    public String toString() {
        return "Week2_35 [name=" + name + ", age=" + age + ", email=" + email + "]";
    }
    public static void main(String[] args) {
        Week2_35 obj=new Week2_35("Arun", 21, "arun@gmail.com");
        System.out.println(obj);
        Week2_35 obj2=new Week2_35(obj);//copy constructor
        System.out.println("this is copy constructor"+obj);
    }
    
}
