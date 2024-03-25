import java.util.Date;

public class IfElseStatementTheme {
    public static void main(String[] arg) {
        String sex = "man";
        System.out.println("1. Перевод псевдокода на язык Java");
        if (sex != "man") {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина ");
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
                System.out.println("Бинго\n");
            } else if (firstLatterName == 'I') {
                System.out.println("Чистая удача\n");
            } else {
                System.out.println("Давай другое имя\n");
            }

        int numFirst = 20;
        int numSecond = 30;
        System.out.println("2. Поиск большего числа");
            if (numFirst > numSecond) {
                System.out.println("1 = " + numFirst + "\n" +
                    "2 = " + numSecond + "\n");
            } else if (numSecond > numFirst) {
                System.out.println("1 = " + numSecond + "\n" +
                    "2 = " + numFirst + "\n");
            } else {
                System.out.println("Значения равны:" + numFirst + " = " + numSecond + "\n");
            }

        int numThree = 15;
        System.out.println("3. Проверка числа");
            if (numThree == 0) {
                System.out.println("Число равно = " + numThree + "\n");
            } else if (numThree % 2 == 1 & numThree > 0) {
                System.out.println(numThree + " является положительным и нечетным\n");
            } else if (numThree % 2 == 1 & numThree < 0) {
                System.out.println(numThree + " является отрицательным и нечетным\n");
            } else if (numThree % 2 == 0 & numThree > 0) {
                System.out.println(numThree + " является положительным и четным\n");
            } else if (numThree % 2 == 0 & numThree < 0) {
                System.out.println(numThree + " является отрицательным и четным\n");
            }

        int numFour = 123;
        int numFive = 223;
        System.out.println("4. Поиск одинаковых цифр в числах");
        String numberStringNumFour = Integer.toString(numFour);
        char firstNumberFour = numberStringNumFour.charAt(0);
        char secondNumberFour = numberStringNumFour.charAt(1);
        char thirdNumberFour = numberStringNumFour.charAt(2);
        String numberStringNumFive = Integer.toString(numFive);
        char firstNumberFive = numberStringNumFive.charAt(0);
        char secondNumberFive = numberStringNumFive.charAt(1);
        char thirdNumberFive = numberStringNumFive.charAt(2);
            if (firstNumberFour == firstNumberFive) {
                System.out.println("Исходные числа: " + numFour + " ; " + numFive);
                System.out.println("Одинаковые в них цифры: " + firstNumberFour);
                System.out.println("Номера разрядов: " + "0" + " ; " + "0\n");
            } if (secondNumberFour == secondNumberFive) {
                System.out.println("Исходные числа: " + numFour + " ; " + numFive);
                System.out.println("Одинаковые в них цифры: " + secondNumberFour);
                System.out.println("Номера разрядов: " + "1" + " ; " + "1\n");
            } if (thirdNumberFour == thirdNumberFive) {
                System.out.println("Исходные числа: " + numFour + " ; " + numFive);
                System.out.println("Одинаковые в них цифры: " + thirdNumberFour);
                System.out.println("Номера разрядов: " + "2" + " ; " + "2\n");
            } else {
                System.out.println("Одинаковых цифр нет\n");
            }

        char symbol = '\u0031';
        System.out.println("5. Определение символа по его коду");
            if (Character.isLowerCase(symbol)) {
                System.out.println("Символ " + symbol + " является маленькой буквой\n");
            } else if (Character.isUpperCase(symbol)) {
                System.out.println("Символ " + symbol + " является большой буквой\n");
            } else if (Character.isDigit(symbol)) {
                System.out.println("Символ " + symbol + " является цифрой\n");
            } else {
                System.out.println("Символ " + symbol + " не буква и не цифра\n");
            }

        int money = 301000;
        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
            if (money < 100000) {
                System.out.println("сумма вклада: " + money);
                System.out.println("сумма начисленного 5%: " + (money * 0.05)/365);
                System.out.println("итоговая сумма c 5%: " + (money + 
                    ((money * 0.05)/365)) + "\n");
            } else if (money > 100000 && money <300000) {
                System.out.println("сумма вклада: " + money);
                System.out.println("сумма начисленного 7%: " + (money * 0.07)/365);
                System.out.println("итоговая сумма c 7%: " + (money + 
                    ((money * 0.07)/365)) + "\n");
            } else if (money > 300000) {
                System.out.println("сумма вклада: " + money);
                System.out.println("сумма начисленного 10%: " + (money * 0.10)/365);
                System.out.println("итоговая сумма c 10%: " + (money + 
                    ((money * 0.10)/365)) + "\n");
            }

        float history = 0.59f;
        float programm = 0.92f;
        float two = 2f;
        float three = 3f;
        float four = 4f;
        float five = 5f;
        System.out.println("7. Определение оценки по предметам");
            if (history <= 0.6 && programm <= 0.6) {
                System.out.println("история: " + two);
                System.out.println("программирование : " + two);
                System.out.println("средний балл оценок по предметам : " + 
                    (two + two) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history <= 0.6 && programm > 0.6) {
                System.out.println("история: " + two);
                System.out.println("программирование : " + three);
                System.out.println("средний балл оценок по предметам : " + 
                    (two + three) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history <= 0.6 && programm > 0.73) {
                System.out.println("история: " + two);
                System.out.println("программирование : " + four);
                System.out.println("средний балл оценок по предметам : " + 
                    (two + four) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history <= 0.6 && programm > 0.91) {
                System.out.println("история: " + two);
                System.out.println("программирование : " + five);
                System.out.println("средний балл оценок по предметам : " + 
                    (two + five) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.6 && programm > 0.6) {
                System.out.println("история: " + three);
                System.out.println("программирование : " + three);
                System.out.println("средний балл оценок по предметам : " + 
                    (three + three) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.6 && programm > 0.73) {
                System.out.println("история: " + three);
                System.out.println("программирование : " + four);
                System.out.println("средний балл оценок по предметам : " + 
                    (three + four) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.6 && programm > 0.91) {
                System.out.println("история: " + three);
                System.out.println("программирование : " + five);
                System.out.println("средний балл оценок по предметам : " + 
                    (three + five) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.73 && programm > 0.73) {
                System.out.println("история: " + four);
                System.out.println("программирование : " + four);
                System.out.println("средний балл оценок по предметам : " + 
                    (four + four) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.73 && programm > 0.91) {
                System.out.println("история: " + four);
                System.out.println("программирование : " + five);
                System.out.println("средний балл оценок по предметам : " + 
                    (four + five) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.91 && programm > 0.91) {
                System.out.println("история: " + five);
                System.out.println("программирование : " + five);
                System.out.println("средний балл оценок по предметам : " + 
                    (five + five) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.6 && programm <= 0.6) {
                System.out.println("история: " + three);
                System.out.println("программирование : " + two);
                System.out.println("средний балл оценок по предметам : " + 
                    (three + two) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.73 && programm <= 0.6) {
                System.out.println("история: " + four);
                System.out.println("программирование : " + two);
                System.out.println("средний балл оценок по предметам : " + 
                    (four + five) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.91 && programm <= 0.6) {
                System.out.println("история: " + five);
                System.out.println("программирование : " + two);
                System.out.println("средний балл оценок по предметам : " + 
                    (five + two) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.73 && programm > 0.6) {
                System.out.println("история: " + four);
                System.out.println("программирование : " + three);
                System.out.println("средний балл оценок по предметам : " + 
                    (four + three) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.91 && programm > 0.6) {
                System.out.println("история: " + five);
                System.out.println("программирование : " + three);
                System.out.println("средний балл оценок по предметам : " + 
                    (five + three) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            } else if (history > 0.91 && programm > 0.73) {
                System.out.println("история: " + five);
                System.out.println("программирование : " + four);
                System.out.println("средний балл оценок по предметам : " + 
                    (five + four) / 2);
                System.out.println("средний % по предметам : " + 
                    (history + programm) / 2 + "\n");
            }

        int things = 103000;
        int rent = 5000;
        int primeCost = 9000;
        int income = things - rent - primeCost;
        System.out.println("8. Расчет годовой прибыли");
            if (income <= 0) {
                System.out.println("Прибыль за год: " + income + " руб.\n");
            } else if (income > 0) {
                System.out.println("Прибыль за год: +" + income + " руб.\n");
            } 
    }
}
