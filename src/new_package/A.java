//created 3 variables, constructor, method for variables;

package new_package;

public class A {
    public int d;
    boolean boo; //default  package private, can be used inside package
    private String p;// can be used inside current class

    public A(int d, boolean boo, String p) {
        this.d = d;
        this.boo = boo;
        this.p = p;
    }

    public void printD() {
        System.out.println(d);
    }

    void printDDef() {
        System.out.println(d * 2);
    }

    private void printDPriv() {
        System.out.println(d * 20);
    }

    public static void main(String[] args) {

        A aa = new A(20, true, "Help");
        aa.printD();
        aa.printDDef();
        aa.printDPriv();
    }

}



