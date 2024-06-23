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
        double penCost = 105.5;
        double bookCost = 235.83;
        double discount = 0.11;
        double sum = penCost + bookCost;
        double totaldiscount = sum * discount;
        double totalCost = sum - totaldiscount;
        System.out.println("Общая стоимость товаров без скидки = " + sum + " руб.\n" +
                "Сумма скидки = " + totaldiscount + " руб.\n" +
                "Общая стоимость товаров со скидкой = " + totalCost + " руб.\n");

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
        System.out.println("исходные значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");
        System.out.println("с помощью третьей переменной");
        int swap = b;
        b = a;
        a = swap;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");
        System.out.println("с помощью арифметических действий");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");
        System.out.println("с помощью побитовых операций");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + a + "\n" +
                "Второе значение = " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = (char) 36;
        int decimalDollar = dollar;
        char asterisk = (char) 42;
        int decimalAsterisk = asterisk;
        char sign = (char) 64;
        int decimalAtSign = sign;
        char verticalBar = (char) 124;
        int decimalVerticalBar = verticalBar;
        char tilde = (char) 126;
        int decimalTilde = tilde;
        System.out.println(decimalDollar + "   " + dollar + "\n" +
                decimalAsterisk + "   " + asterisk + "\n" +
                decimalAtSign + "   " + sign + "\n" +
                decimalVerticalBar + "   " + verticalBar + "\n" +
                decimalTilde + "   " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char lowLine = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash + "    " + "\n" +
                "   " + slash + "  " + backslash + "   " + "\n" +
                "  " + slash + lowLine + leftBracket + " " + rightBracket + backslash + "\n" +
                " " + slash + "      " + backslash + " " + "\n" + 
                slash + lowLine + lowLine + lowLine + lowLine + slash + backslash + lowLine + lowLine + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа:");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        System.out.println("Число number содержит: ");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение  = " + (hundreds * tens * ones) + "\n");

        System.out.println("9. Вывод времени:");
        int secs = 86399;
        int mm = (secs / 60) % 60;
        int hh = secs / 3600;
        int ss = secs % 60;
        System.out.println(hh + ":" + mm + ":" + ss + "\n");
    }
}
