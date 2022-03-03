
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mengenlehre {

    // unificationQuantity
    private static <E> List<E> unificationQuantity(List<E> a, List<E> b) {

        Set<E> setList = new HashSet<E>();
        List<E> finish = new ArrayList<E>();

        setList.addAll(a);
        setList.addAll(b);

        finish.addAll(setList);

        return finish;
    }

    // intersections
    public static <E> List<E> intersection(List<E> list1, List<E> list2) {

        Set<E> setList = new HashSet<E>();
        List<E> finish = new ArrayList<E>();

        for (E e : list1) {
            if (list2.contains(e)) {
                setList.add(e);
            }
        }

        finish.addAll(setList);

        return finish;
    }

    // Difference quantities
    public static <E> List<E> differenceQuantities(List<E> list1, List<E> list2) {

        Set<E> setList = new HashSet<E>();
        List<E> finish = new ArrayList<E>();

        for (E e : list1) {
            if (list2.contains(e)) {
            } else {
                setList.add(e);
            }
        }

        finish.addAll(setList);

        return finish;
    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>(
                Arrays.asList(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34));
        List<Integer> b = new ArrayList<Integer>(
                Arrays.asList(9, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49));
        List<Integer> c = new ArrayList<Integer>(
                Arrays.asList(41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10));

        System.out.println("Vereinigungsmenge: " + unificationQuantity(a, unificationQuantity(b, c)));
        System.out.println("Schnittmengen: " + intersection(a, intersection(b, c)));
        System.out.println("Differenzmengen: " + differenceQuantities(a, differenceQuantities(b, c)));
    }

}
