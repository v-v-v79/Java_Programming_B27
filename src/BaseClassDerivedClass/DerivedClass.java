package BaseClassDerivedClass;

public class DerivedClass extends BaseClass {

    public void printString() {
        System.out.println(this.publicString);
    }

    public static void main(String[] args) {

        DerivedClass derivedClass = new DerivedClass();
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.getAccess());
        derivedClass.printString();
    }
}
