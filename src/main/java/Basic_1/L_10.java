package Basic_1;
/*
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */
public class L_10 {

    public static final int DIMM = 3;

    public static void main(String[] args) {
        Double[] arr = new Double[DIMM];
        for (int i = 0; i < DIMM; i++) {
            arr[i] = Math.random();
        }
        Double max=arr[0],min=arr[0],avg=arr[0];
        for (int i = 1; i < DIMM; i++) {
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
            avg+=arr[i];
        }
        avg/= DIMM;
        System.out.printf("Max = %s\nMin = %s\nAVG = %s\n",max,min,avg);
    }
}
