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
        int num3 = -18;
        if (num3 == 0) {
            System.out.println("Число равно = " + num3);
        }
        if (num3 < 0) {
            if (num3 % 2 == 1) {
                System.out.println(num3 + " является отрицательным и нечетным");
            } else {
                System.out.println(num3 + " является отрицательным и четным");
            }
        }
        if (num3 > 0) {
            if (num3 % 2 == 0) {
                System.out.println(num3 + " является положительным и четным");
            } else {
                System.out.println(num3 + " является положительным и нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 123;
        int num5 = 234;
        int num4Ones = num4 % 10;
        int num4Tens = (num4 / 10) % 10;
        int num4Hunds = (num4 / 100) % 10;
        int num5Ones = num5 % 10;
        int num5Tens = (num5 / 10) % 10;
        int num5Hunds = (num5 / 100) % 10;
        System.out.println("Исходные числа: " + num4 + " и " + num5);
        if (num4Ones != num5Ones && num4Tens != num5Tens && num4Hunds != num5Hunds) {
            System.out.println("Равных цифр в одних и тех же разрядах нет");
        } else {
            if (num4Ones == num5Ones) {
                System.out.println("Одинаковые в них цифры: " + num4Ones + " и " + num5Ones + "\n" + 
                        "Номера разрядов: " + "2 и 2");
            }
            if (num4Tens == num5Tens) {
                System.out.println("Одинаковые в них цифры: " + num4Tens + " и " + num5Tens + "\n" + 
                        "Номера разрядов: " + "1 и 1");
            }
            if (num4Hunds == num5Hunds) {
                System.out.println("Одинаковые в них цифры: " + num4Hunds + " и " + num5Hunds + "\n" + 
                        "Номера разрядов: " + "0 и 0");
            }
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';
        if (Character.isLowerCase(symbol)) {
            System.out.println("'"+ symbol + "'"+ " - маленькая буква");
        } else if (Character.isUpperCase(symbol)) {
            System.out.println("'" + symbol + "'" + " - большая буква");
        } else if (Character.isDigit(symbol)) {
            System.out.println("'" + symbol + "'" + " - является цифрой");
        } else {
            System.out.println("'" + symbol + "'" + " - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        double money = 321123.59;
        double percent;
        double totalSum;
        if (money < 100000) {
            percent = ((money * 0.05) / 365);
            totalSum = (money + ((money * 0.05) / 365));
            System.out.println("сумма вклада: " + money + "\n" + 
                    "сумма начисленного 5%: " + percent + "\n" +
                    "итоговая сумма c 5%: " + totalSum);
        } else if (money > 100000 && money < 300000) {
            percent = ((money * 0.07) / 365);
            totalSum = (money + ((money * 0.07) / 365));
            System.out.println("сумма вклада: " + money + "\n" + 
                    "сумма начисленного 7%: " + percent + "\n" +
                    "итоговая сумма c 7%: " + totalSum);
        } else if (money > 300000) {
            percent = ((money * 0.10) / 365);
            totalSum = (money + ((money * 0.10) / 365));
            System.out.println("сумма вклада: " + money + "\n" + 
                    "сумма начисленного 10%: " + percent + "\n" +
                    "итоговая сумма c 10%: " + totalSum);
        }

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyScore = 2;
        double history = 0.59;
        if (history > 0.6) {
            historyScore = 3;
        }
        if (history > 0.73) {
            historyScore = 4;
        }
        if (history > 0.91) {
            historyScore = 5;
        }
        int programmScore = 2;
        double programm = 0.92;
        if (programm > 0.6) {
            programmScore = 3;
        }
        if (programm > 0.73) {
            programmScore = 4;
        }
        if (programm > 0.91) {
            programmScore = 5;
        }
        double averageScore = (double) (historyScore + programmScore) / 2;
        double averagePercent = (double) (history + programm) / 2;
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
