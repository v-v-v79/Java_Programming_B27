package day38_final;

public abstract class ParentOfFinalClass {
    public final String name;

    public ParentOfFinalClass(String name) {
        this.name = name;
    }
    public String concatenate(String str, String str2) {

        return str + str2;
    }

    public abstract String concatenate(String str, String str2, String str3);
}
