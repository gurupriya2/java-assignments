package accessmodifiers.p1;

public class C1p1 {
    private int privateVar = 1;
    int defaultVar = 2;
    public int publicVar = 3;
    protected int protectedVar = 4;
    static protected int protectedStaticVar = 5;


    public static void main(String[] args) {
        C1p1 c1p1 = new C1p1();
        System.out.println(c1p1.privateVar);
        //The private variable is accessible within  the class.
        // private only works in same class and not in diff class
       System.out.println(c1p1.defaultVar);
        // default only works in the class which has same packages
        System.out.println(c1p1.publicVar);
       // public works in diff class as well diff packages.
       System.out.println(c1p1.protectedVar);
       //
   }
}
