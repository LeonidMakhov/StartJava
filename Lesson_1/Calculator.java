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