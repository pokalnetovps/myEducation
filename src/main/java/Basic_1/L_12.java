package Basic_1;
/*
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class L_12 {
    public static void main(String[] args) {
        boolean fg;
        for (int i = 2; i <= 100; i++) {
            fg = true;
            for(int j = 2; j<i;j++){
                if ((i%j)==0){
                    fg=false;
                    break;
                }
            }
            if (fg) System.out.println(i);
        }
    }
}
