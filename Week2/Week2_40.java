//Implement a constructor in a class that throws a custom exception if
// invalid data is passed.
public class Week2_40 {
    String name ;
    int age;
    Week2_40(String name, int age) throws Exception{
        this.name=name;
        this.age=age;
        if(name==null){
         throw new Exception("name can not be null");

        }
        if (age<0) {

                throw new Exception("age can not be negative");
        }

    }
    public static void main(String[] args) throws Exception {
        Week2_40 obj=new Week2_40("arun",-6);
         //Week2_40 obj1=new Week2_40(null,21);
         // Week2_40 obj2=new Week2_40(null,-21);
    }

    
}
