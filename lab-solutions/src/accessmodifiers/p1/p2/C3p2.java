package accessmodifiers.p1.p2;

import accessmodifiers.p1.C1p1;

public class C3p2 {
    public static void main(String[] args) {
        C1p1 c1p1 = new C1p1();
        // The private variable is accessible within  the class.
       // System.out.println(c1p1.privateVar);
      // System.out.println(c1p1.defaultVar);
        System.out.println(c1p1.publicVar);
       // System.out.println(c1p1.protectedVar);
    }
}


