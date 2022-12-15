package mentor_tasks;

import java.util.*;

public class ArrayListRemoveElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()
        ));
        ArrayList<Integer> listOfNums = new ArrayList<>(Arrays.asList(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        ));

        System.out.println(removeValues(listOfNums, 100));
        System.out.println(removeElements(listOfStrings, "Ahmed"));

//        for (String element : sortElementsAsc(listOfStrings)) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (String element : sortElementsDesc(listOfStrings)) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (Integer element : sortElementsAsc(listOfNums)) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        for (Integer element : sortElementsDesc(listOfNums)) {
//            System.out.print(element + " ");
//        }
//
//        for (String string : removeElements(listOfStrings, "Ahmed")) {
//            System.out.print(string + " ");
//        }
    }

    public static <T> void sortElementsAsc(ArrayList<T> list) {
        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static <T> void sortElementsDesc(ArrayList<T> list) {
    ListIterator<T> iterator = list.listIterator();
    while (iterator.hasPrevious())
        System.out.println(iterator.previous());
    }

    public static <T> ArrayList<T> removeElements(ArrayList<T> list, T element) {
        Iterator<T> iterator = list.iterator();
        T temp;
        while (iterator.hasNext()) {
            temp = iterator.next();
            if(temp.toString().equals(element.toString()))
                iterator.remove();
        }
        return list;
    }
    public static ArrayList<Integer> removeValues (ArrayList<Integer> list, int element) {
        Iterator<Integer> iterator = list.iterator();
        int temp;
        while (iterator.hasNext()) {
            temp = iterator.next();
            if(temp > element)
                iterator.remove();
        }
        return list;
    }
}
