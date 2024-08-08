import java.util.Date;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int a = -10;
        int b = 21;
        int sumEvenCounts = 0;
        int sumOddCounts = 0;
        do {
            if (a % 2 == 0) {
                sumEvenCounts = sumEvenCounts + a;
            } else if (a % 2 != 0) {
                sumOddCounts = sumOddCounts + a;
            }
            a++;
        } while (a <= b);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEvenCounts + 
                " , a нечетных = " + sumOddCounts);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");
        int numFirst = 10;
        int numSecond = 5;
        int numThird = -1;
        int maxNumber = 0;
        int minNumber = 0;
        if (numFirst > numSecond & numFirst > numThird) {
            maxNumber = numFirst;
        } else if (numSecond > numFirst & numSecond > numThird) {
            maxNumber = numSecond;
        } else {
            maxNumber = numThird;
        }
        if (numFirst < numSecond & numFirst < numThird) {
            minNumber = numFirst;
        } else if (numSecond < numFirst & numSecond < numThird) {
            minNumber = numSecond;
        } else {
            minNumber = numThird;
        }
        for (int i = minNumber; i <= maxNumber; i++) {
            System.out.println(i + " ");
        }
    }
}


