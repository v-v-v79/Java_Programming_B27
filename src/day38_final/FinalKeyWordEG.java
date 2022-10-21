package day38_final;

public final class FinalKeyWordEG extends ParentOfFinalClass {

    public final String name2;
    public FinalKeyWordEG(String name, String name2) {
        super(name);
        this.name2 = name2;
    }

    @Override
    public String concatenate(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void main(String[] args) {
        FinalKeyWordEG first = new FinalKeyWordEG("1", "2");
        System.out.println(first.concatenate(first.name, first.name2));
    }

}
