import java.util.Date;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        String sex = "man";
        if (sex != "man") {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        int age = 25;
        if (age > 18) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Ребенок");
        }

        float height = 2f;
        if (height < 1.8f) {
            System.out.println("Высокий");
        } else {
            System.out.println("Низкий");
        }

        char firstLatterName = "Ikosin".charAt(0);
        if (firstLatterName == 'M') {
            System.out.println("Бинго");
        } else if (firstLatterName == 'I') {
            System.out.println("Чистая удача");
        } else {
            System.out.println("Давай другое имя");
        }

        System.out.println("\n2. Поиск большего числа\n");
        int num1 = 30;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("большее значение = " + num1 + "\n" +
                    "меньшее значение = " + num2);
        } else if (num2 > num1) {
            System.out.println("большее значение = " + num2 + "\n" +
                    "меньшее значение = " + num1);
        } else {
            System.out.println("Значения равны: " + num1 + " = " + num2);
        }

        System.out.println("\n3. Проверка числа\n");
        int num3 = 17;
        if (num3 == 0) {
            System.out.println("Число равно = " + num3);
        } else {
            System.out.println("Число равно = " + num3);
            String positivity = "положительным";
            if (num3 < 0) {
                positivity = "отрицательным";
            }
            String parity = " и четным";
            if (num3 % 2 != 0) {
                parity = " и нечетным";
            }
            System.out.println(positivity + parity);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 123;
        int num5 = 223;
        boolean isEqualOnes = (num4 % 10) == (num5 % 10);
        boolean isEqualTens = (num4 / 10 % 10) == (num5 / 10 % 10);
        boolean isEqualHundreds = (num4 / 100) == (num5 / 100);
        if (!isEqualOnes && !isEqualTens && !isEqualHundreds) {
            System.out.println("Равных цифр в одних и тех же разрядах нет");
        } else {
            System.out.println("В числах " + num4 + " и " + num5 + " одинаковые цифры в разрядах:");
            if (isEqualOnes) {
                System.out.println("1 = " + num4 % 10);
            }
            if (isEqualTens) {
                System.out.println("2 = " + num4 / 10 % 10);
            }
            if (isEqualHundreds) {
                System.out.println("3 = " + num4 / 100);
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';
        if (Character.isLowerCase(symbol)) {
            System.out.println("'" + symbol + "'" + " - маленькая буква");
        } else if (Character.isUpperCase(symbol)) {
            System.out.println("'" + symbol + "'" + " - большая буква");
        } else if (Character.isDigit(symbol)) {
            System.out.println("'" + symbol + "'" + " - является цифрой");
        } else {
            System.out.println("'" + symbol + "'" + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        float money = 321123.59f;
        float percent = 0.1f;
        if (money < 100000) {
            percent = 0.05f;
        } else if (money >= 100000 & money <= 300000) {
            percent = 0.07f;
        } 
        float totalSum = money * percent;
        System.out.println("сумма вклада: " + money + "\n" + 
                    "сумма начисленного %: " + totalSum + "\n" +
                    "итоговая сумма c %: " + (totalSum + money));

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyScore = 2;
        double historyPercent = 0.59;
        if (historyPercent > 0.6) {
            historyScore = 3;
        } else if (historyPercent > 0.73) {
            historyScore = 4;
        } else if (historyPercent > 0.91) {
            historyScore = 5;
        }
        int programmScore = 2;
        double programmPercent = 0.92;
        if (programmPercent > 0.6) {
            programmScore = 3;
        } else if (programmPercent > 0.73) {
            programmScore = 4;
        } else if (programmPercent > 0.91) {
            programmScore = 5;
        }
        double averageScore = (double) (historyScore + programmScore) / 2;
        double averagePercent = (double) (historyPercent + programmPercent) / 2;
        System.out.println("Оценка по истории: " + historyScore + "\n" +
                "Оценка по программированию: " + programmScore + "\n" +
                "Средний балл оценок по предметам: " + averageScore + "\n" +
                "Средний % по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли\n");
        double things = 1563025.233;
        double rent = 5123.018;
        double primeCost = 9000.729;
        double income = things - rent - primeCost;
        if (income < 0) {
            System.out.println("Прибыль за год: " + income + " руб.");
        } else if (income > 0) {
            System.out.println("Прибыль за год: +" + income + " руб.");
        } 
    }
}
