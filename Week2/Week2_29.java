//Program to demonstrate encapsulation by using private variables and public methods.
 class  Encapsulation {
private String name;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Encapsulation [name=" + name + ", email=" + email + "]";
    }
}
public class Week2_29 {
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
        e.setName("Arun");
        e.setEmail("arun@gmail.com");
        System.out.println("name:"+ e.getName()+"email:" +e.getEmail());
        System.out.println(e);

       
    }
    
    
}
