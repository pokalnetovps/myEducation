package Basic_1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
 */
public class L_13 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 3, 4, 2, 3, 1, 0, 6, 4, 3};
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(rmToArray(arr, 4)));
        System.out.println(Arrays.toString(rmToArray(arr, 3)));
    }
    static int[] rmToArray(int[] array, int item){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==item){
                count++;
        }else{
                array[i-count]=array[i];
            }
        }
    return Arrays.copyOf(array,array.length-count);
    }
}
