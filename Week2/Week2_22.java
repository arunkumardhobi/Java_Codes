//Create a class with private members and access them via public getter and setter methods.
 class  Demo {
private  String name;
     private  String email;
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
    
}


public class Week2_22 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.setName("arun");
        obj.setEmail("arun@gmail.com");
        System.out.println("name:"+obj.getName());
        System.out.println("email:"+obj.getEmail());
    }
      
}

