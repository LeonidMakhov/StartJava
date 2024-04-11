import java.util.Date;

public class VariableTheme {
    public static void main(String[] arg) {
        boolean wifi = true;
        byte pcRAM = 16;
        short bitBuilds = 64;
        int hDD = 512000;
        long keyProduct = 455665221;
        char percent = '%';
        float cpuFrequency = 243.5f;
        double pcBuildNumber = 45.44456564688d;
        String str = "Компьютер ЛЕОНИДА !!!!";
        System.out.println("1. Вывод характеристик компьютера");
        System.out.println("Имя компьютера- " + str + " на 100 " + percent + "\n" +
                "Наличие Wifi- " + wifi +"\n" +
                "Оперативная память- " + pcRAM + " Гб\n" +
                "Тип системы- " + bitBuilds + " - разрядная система\n" +
                "Емкость жесткого диска- " + hDD + " Мб\n" +
                "Ключ продукта- " + keyProduct +"\n" +
                "Частота процессора- " + cpuFrequency + "GHz\n" +
                "Сборка ОС- " + pcBuildNumber +"\n");

        double penCost = 100d;
        double bookCost = 200d;
        double discount = 0.11d;
        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.println("Общая стоимость товаров без скидки = " + (penCost + bookCost) + " руб.\n" +
                "Сумма скидки = " + ((penCost + bookCost) * discount) + " руб.\n" +
                "Общая стоимость товаров со скидкой = " + ((penCost + bookCost) - 
                ((penCost + bookCost) * discount)) + " руб.\n");

        System.out.println("3. Вывод слово JAVA");
        System.out.println("    J    a   v     v   a");
        System.out.println("    J   a a   v   v   a a");
        System.out.println("J   J  aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a\n");

        byte maxEeightBitInteger = 127;
        short maxSixteenBitInteger = 32767;
        int maxThirtyTwonBitInteger = 2147483647;
        long maxLongInteger = 9223372036854775807l;
        System.out.println("4. Вывод min и max значений целых числовых типов");
        System.out.println("первоначальное значение = " + maxEeightBitInteger + "\n" +
                "значение после инкремента на единицу = " + (++maxEeightBitInteger) + "\n" +
                "значение после декремента на единицу = " + (--maxEeightBitInteger) + "\n");
        System.out.println("первоначальное значение = " + maxSixteenBitInteger + "\n" +
                "значение после инкремента на единицу = " + (++maxSixteenBitInteger) + "\n" +
                "значение после декремента на единицу = " + (--maxSixteenBitInteger)+ "\n");
        System.out.println("первоначальное значение = " + maxThirtyTwonBitInteger + "\n" +
                "значение после инкремента на единицу = " + (++maxThirtyTwonBitInteger) + "\n" +
                "значение после декремента на единицу = " + (--maxThirtyTwonBitInteger)+ "\n");
        System.out.println("первоначальное значение = " + maxLongInteger + "\n" +
                "значение после инкремента на единицу = " + (++maxLongInteger) + "\n" +
                "значение после декремента на единицу = " + (--maxLongInteger)+ "\n");

        int varFirst = 2;
        int varSecond = 5;
        int varThird;
        System.out.println("5. Перестановка значений переменных");
        System.out.println("с помощью третьей переменной:\n" +
                "исходные значения переменных:\n" +
                "Первое значение = " + varFirst + "\n" +
                "Второе значение = " + varSecond);
        varThird = varSecond;
        varSecond = varFirst;
        varFirst = varThird;
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + varFirst + "\n" +
                "Второе значение = " + varSecond + "\n");
        System.out.println("с помощью арифметических действий:\n" +
                "исходные значения переменных:\n" +
                "Первое значение = " + varFirst + "\n" +
                "Второе значение = " + varSecond);
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + (varFirst + varSecond - varFirst) + "\n" +
                "Второе значение = " + (varSecond + varFirst - varSecond) + "\n");
        System.out.println("с помощью побитовых операций:\n" +
                "исходные значения переменных:\n" +
                "Первое значение = " + (Integer.toBinaryString(varFirst)) + "\n" +
                "Второе значение = " + (Integer.toBinaryString(varSecond)));
        System.out.println("новые значения переменных:\n" +
                "Первое значение = " + (Integer.toBinaryString(varFirst ^ varFirst | varSecond)) + "\n" +
                "Второе значение = " + (Integer.toBinaryString(varSecond ^ varSecond|varFirst)) + "\n");

        int decimalDollar = 36;
        char characterDollar = '$';
        int decimalAsterisk = 42;
        char characterAsterisk = '*';
        int decimalAtSign = 64;
        char characterAtSign = '@';
        int decimalVerticalBar = 124;
        char characterVerticalBar = '|';
        int decimalTilde = 126;
        char characterTilde = '~';
        System.out.println("6. Вывод символов и их кодов");
        System.out.println(decimalDollar + "   " + characterDollar + "\n" +
                decimalAsterisk + "   " + characterAsterisk + "\n" +
                decimalAtSign + "   " + characterAtSign + "\n" +
                decimalVerticalBar + "   " + characterVerticalBar + "\n" +
                decimalTilde + "   " + characterTilde + "\n");

        char characterSlash = '/';
        char characterUnderscore = '_';
        char characterLeftParenthesis = '(';
        char characterRightParenthesis = ')';
        char characterBackslash = ')';
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        System.out.println("    " + characterSlash + characterBackslash + "    " + "\n" +
                "   " + characterSlash + "  " + characterBackslash + "   " + "\n" +
                "  " + characterSlash + characterUnderscore + characterLeftParenthesis + " " +
                characterRightParenthesis + characterBackslash + "\n" + " " + characterSlash +
                "      " + characterBackslash + " " + "\n" + characterSlash + characterUnderscore +
                characterUnderscore + characterUnderscore + characterUnderscore + characterSlash +
                characterBackslash + characterUnderscore +
                characterUnderscore + characterBackslash + "\n");

        int varNum = 123;
        int hundredsVarNum = varNum / 100;
        int tensNum = varNum % 100 / 10;
        int unitsNum = varNum % 10 / 1;
        System.out.println("8. Вывод количества сотен, десятков и единиц числа:");
        System.out.println("Число varNum содержит: ");
        System.out.println("сотен - " + hundredsVarNum);
        System.out.println("десятков - " + tensNum);
        System.out.println("единиц - " + unitsNum);
        System.out.println("Сумма его цифр = " + (hundredsVarNum + tensNum + unitsNum));
        System.out.println("Произведение  = " + (hundredsVarNum * tensNum * unitsNum) + "\n");

        int sec = 86399;
        int min = (sec / 60) % 60;
        int hour = sec / 3600;
        System.out.println("9. Вывод времени: " + hour + ":" + min + ":" + 
                (sec % 60)+ "\n");
    }
}
