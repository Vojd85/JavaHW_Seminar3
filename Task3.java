// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HomeWorks.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillList(list, 15);
        System.out.println(list);
        System.out.printf("Максимальное значение %d\n",maxVal(list));
        System.out.printf("Минимальное значение %d\n", minVal(list));
        System.out.printf("Среднее значение %.2f",middleVal(list));
    }

    static List<Integer> fillList(List<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add((int)(Math.random() * 100));
        }
        return list;
    }

    static int maxVal(List<Integer> list) {
        Iterator<Integer> nums = list.iterator();
        int temp = 0;
        while (nums.hasNext()){
            int num = nums.next();
            if (num > temp){
                temp = num;
            }
        }
        return temp;
    }
    static int minVal(List<Integer> list) {
        Iterator<Integer> nums = list.iterator();
        int temp = list.get(0);
        while (nums.hasNext()) {
            int num = nums.next();
            if (num<temp) {
                temp = num;
            }
        }
        return temp;
    }
    static double middleVal(List<Integer> list) {
        Iterator<Integer> nums = list.iterator();
        int sum = 0;
        while (nums.hasNext()) {
            int num = nums.next();
            sum += num;
        }
        return (double)sum/list.size();
    }
}
