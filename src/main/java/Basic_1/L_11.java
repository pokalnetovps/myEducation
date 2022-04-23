package Basic_1;
/*
Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */
public class L_11 {
    public static void main(String[] args) {
        final int DIMM = 20;
        int[] arr = new int[DIMM];
        for (int i = 0; i < DIMM; i++) {
            arr[i]=(int)(100*Math.random());
            System.out.printf("%2d - %3d\n",(i+1),arr[i]);
        }
        System.out.println("--------------------");
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i = 0; i < (DIMM-1); i++) {
                if (arr[i]>arr[i+1]) {
                    flag = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            }

        for (int i = 0; i < DIMM; i++) {
            System.out.printf("%2d - %3d\n",(i+1),arr[i]);
        }

    }
}
