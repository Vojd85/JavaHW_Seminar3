// Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomeWorks.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        fillList(nums, 20);
        System.out.println(nums);
        Iterator<Integer> numsIterator = nums.iterator();
        while (numsIterator.hasNext()) {
            Integer num = numsIterator.next();
            if (num%2 == 0) {
                numsIterator.remove();
            }
        }
        System.out.println(nums);
    }

    static List<Integer> fillList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add((int)(Math.random() * 100));
        }
        return list;
    }

    // static
}
