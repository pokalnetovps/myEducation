package OOP_2;

import java.util.Arrays;
import java.util.Random;

public class L_21 {
    class RandomElenents {
        int[] elements;
        int[] massElements;
        int[] limit;
        int massAll = 0;

        RandomElenents(int[] e, int[] m) {
            elements = Arrays.copyOf(e, e.length);
            massElements = Arrays.copyOf(m, m.length);
            limit = new int[massElements.length];
            for (int i = 0; i < massElements.length; i++) {
                massAll += massElements[i];
                limit[i] = massAll;
            }
        }

        public int getElementRND(){
            int random = (int)(massAll*Math.random());
            for (int i = 0; i < elements.length; i++) {
                if(elements[i]>random){
                    return elements[i];
                }
            }
        }

    }
}
