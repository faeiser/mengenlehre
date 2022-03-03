
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {

    private static List<Integer> select_sort(List<Integer> list) {
        // ### introduction comparison loop 1
        for (int i = 0; i < list.size(); i++) {
            // ### variable smallest hit
            int index_min = i;
            // ### introduction comparative loop 2 & separation
            for (int j = 1 + i; j < list.size(); j++) {
                // ### storage of the minimum value(index)
                if (list.get(i) > list.get(j)) {
                    if (list.get(j) < list.get(index_min)) {
                        index_min = j;
                    }
                }
            }
            // ### shift values
            int min_number = list.get(index_min);
            list.set(index_min, list.get(i));
            list.set(i, min_number);
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> number_array_unsorted = new ArrayList<Integer>(
                Arrays.asList(99, 38, 61, 111, 14, 3, 37, 42, 87, 69, 32, 5, 110));

        System.out.println(select_sort(number_array_unsorted));
    }
}
