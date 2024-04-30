import java.util.Date;

public class VariableTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        boolean hasWifi = true;
        byte memory = 16;
        short bitBuilds = 64;
        int hddValue = 512000;
        long keyProduct = 455665221;
        char percent = '%';
        float cpuFrequency = 243.5f;
        double systemModel = 45.44456564688d;
        System.out.println("Модель системы- " + systemModel + "\n" +
                "Наличие Wifi- " + hasWifi + "\n" +
                "Оперативная память- " + memory + " Гб RAM\n" +
                "Тип системы- " + bitBuilds + " - разрядная система\n" +
                "Емкость жесткого диска- " + hddValue + " Мб\n" +
                "Ключ продукта- " + keyProduct + "\n" +
                "Частота процессора- " + cpuFrequency + "GHz\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double penCost = 100d;
        double bookCost = 200d;
        double discount = 0.11d;
        System.out.println("Общая стоимость товаров без скидки = " + (penCost + bookCost) + " руб.\n" +
                "Сумма скидки = " + ((penCost + bookCost) * discount) + " руб.\n" +
                "Общая стоимость товаров со скидкой = " + ((penCost + bookCost) - 
                ((penCost + bookCost) * discount)) + " руб.\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a   v     v   a");
        System.out.println("    J   a a   v   v   a a");
        System.out.println("J   J  aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println("первоначальное значение = " + maxByte + "\n" +
                "значение после инкремента на единицу = " + (++maxByte) + "\n" +
                "значение после декремента на единицу = " + (--maxByte) + "\n");
        short maxShort = 32767;
        System.out.println("первоначальное значение = " + maxShort + "\n" +
                "значение после инкремента на единицу = " + (++maxShort) + "\n" +
                "значение после декремента на единицу = " + (--maxShort) + "\n");
        int maxInt = 2147483647;
        System.out.println("первоначальное значение = " + maxInt + "\n" +
                "значение после инкремента на единицу = " + (++maxInt) + "\n" +
                "значение после декремента на единицу = " + (--maxInt) + "\n");
        long maxLong = 9223372036854775807L;
        System.out.println("первоначальное значение = " + maxLong + "\n" +
                "значение после инкремента на единицу = " + (++maxLong) + "\n" +
                "значение после декремента на единицу = " + (--maxLong) + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int swap;
        swap = b;
        System.out.println("исходные значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");
        System.out.println("с помощью третьей переменной");
        b = a;
        a = swap;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");
        System.out.println("с помощью арифметических действий");
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + (a + b - a) + "\n" +
                "Второе значение = " + (a + b - b) + "\n");
        System.out.println("с помощью побитовых операций");
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        int decimalDollar = 36;
        char dollar = (char) decimalDollar;
        int decimalAsterisk = 42;
        char asterisk = (char) decimalAsterisk;
        int decimalAtSign = 64;
        char sign = (char) decimalAtSign;
        int decimalVerticalBar = 124;
        char verticalBar = (char) decimalVerticalBar;
        int decimalTilde = 126;
        char tilde = (char) decimalTilde;
        System.out.println(decimalDollar + "   " + dollar + "\n" +
                decimalAsterisk + "   " + asterisk + "\n" +
                decimalAtSign + "   " + sign + "\n" +
                decimalVerticalBar + "   " + verticalBar + "\n" +
                decimalTilde + "   " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash + "    " + "\n" +
                "   " + slash + "  " + backslash + "   " + "\n" +
                "  " + slash + underscore + leftParenthesis + " " +
                rightParenthesis + backslash + "\n" + " " + slash +
                "      " + backslash + " " + "\n" + slash + underscore +
                underscore + underscore + underscore + slash +
                backslash + underscore +
                underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа:");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10 / 1;
        System.out.println("Число number содержит: ");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение  = " + (hundreds * tens * ones) + "\n");

        System.out.println("9. Вывод времени:");
        int ss = 86399;
        int mm = (ss / 60) % 60;
        int hh = ss / 3600;
        System.out.println(hh + ":" + mm + ":" + (ss % 60) + "\n");
    }
}
