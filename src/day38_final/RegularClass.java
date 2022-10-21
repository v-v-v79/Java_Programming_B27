package day38_final;

public class RegularClass {
    public static void main(String[] args) {
        FinalKeyWordEG finalKeyWordEG = new FinalKeyWordEG("final", "final1");
        System.out.println(finalKeyWordEG.name);
        System.out.println(finalKeyWordEG.name2);
        FinalKeyWordEG second = new FinalKeyWordEG("final2", "final3");
        System.out.println(second.name);
        System.out.println(second.name2);
        System.out.println(second.concatenate(finalKeyWordEG.name, second.name2));
        System.out.println(finalKeyWordEG.concatenate(finalKeyWordEG.concatenate
                (second.name, finalKeyWordEG.name2), finalKeyWordEG.name, second.name2));
    }
}
