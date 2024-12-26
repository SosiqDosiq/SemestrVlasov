import java.util.ArrayList;

import java.util.HashSet;

import java.util.List;
import java.util.ListIterator;

public class w2 {
    public static void
    main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(4,5,6,7,8);

        List<Integer> result = FindCommonElements(list1,list2);
        System.out.println(result); // Output: [4,5]
    }
    public static List<Integer>
    FindCommonElements(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set = new HashSet<>(list1);
        List<Integer>
                commonElements = new ArrayList<>();
        for (Integer num : list2) {
            if(set.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;

    }
}
