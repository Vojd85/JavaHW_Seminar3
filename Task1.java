// Реализовать алгоритм сортировки слиянием

package HomeWorks.Seminar3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arrInt = {1, 45, 64, 3, 15, 92, -44, -3, 10, 2, 54, 34, 98, 5, 7, 3, 11, 74, 44, 2, 8, 6};
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrSort(arrInt)));
    }

    static int[] arrSort(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length < 2){
            return arr;
        }
        int mid = arr.length/2;
        int[] arrA = new int[mid];
        
        System.arraycopy(arr, 0, arrA, 0, mid);
        int[] arrB = new int[arr.length - mid];
        System.arraycopy(arr, mid, arrB, 0, arr.length - mid);
        arrA = arrSort(arrA);
        arrB = arrSort(arrB);
        return arrMerge(arrA, arrB);
    }

    static int[] arrMerge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (ind1 == arr1.length) {
                arr3[i] = arr2[ind2];
                ind2+=1;
            }
            else if (ind2 == arr2.length) {
                arr3[i] = arr1[ind1];
                ind1+=1;
            }
            else if (arr1[ind1] < arr2[ind2]) {
                arr3[i] = arr1[ind1];
                ind1+=1;
            }
            else {
                arr3[i] = arr2[ind2];
                ind2+=1;
            }
        }
        return arr3;
    }   
}
