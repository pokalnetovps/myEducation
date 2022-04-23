package Basic_1;

import static java.lang.Math.*;

public class l_11 {

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
