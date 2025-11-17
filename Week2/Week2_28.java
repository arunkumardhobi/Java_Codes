// Demonstration of different access modifiers in Java

import com.Demo_28;

public class Week2_28 extends Demo_28 {
    public static void main(String[] args) {
        Demo_28 obj = new Demo_28();
        obj.publicAccessModifier();
      // obj.privateAccessModifier();accessible only within this class.
      //  obj.protectedAccessModifier();accessible only within same packege.
      Week2_28 obj2=new Week2_28();
      obj2.protectedAccessModifier();
    }

    
}
