package OOP_2;

public class L_20 {
    public static Vector[] getVectors(int n){
        Vector[] arr = new Vector[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new Vector();
        }
        return arr;
    }

    public static void main(String[] args) {
        Vector[] vectors = getVectors(2);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].scalar(vectors[1]));
        System.out.println(vectors[0].mult(vectors[1]));
        System.out.println(vectors[0].diff(vectors[1]));


    }

}
