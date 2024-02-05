import java.util.Date;

public class VariableTheme {
    public static void main(String[] arg) {
        Boolean wifi = true;
        byte numA = 16;
        short numB = 64;
        int numC = 512000;
        long numD = 455665221;
        char numE = '%';
        float numF = 243.5f;
        double numG = 45.44456564688d;
        String str = "Компьютер ЛЕОНИДА !!!!";
        System.out.println("1. Вывод характеристик компьютера: " +"\n" +
            "Имя компьютера- " + str + " на 100 " + numE + "\n" +
            "Наличие Wifi- " + wifi +"\n" +
            "Оперативная память- " + numA + " Гб" + "\n" +
            "Тип системы- " + numB + " - разрядная система" + "\n" +
            "Емкость жесткого диска- " + numC + " Мб" +"\n" +
            "Ключ продукта- " + numD +"\n" +
            "Частота процессора- " + numF + "GHz" +"\n" +
            "Сборка ОС- " + numG +"\n"
        );

        double numH = 100d;
        double numI = 200d;
        double numK = 0.11d;
        System.out.println("2. Расчет стоимости товара со скидкой: " + "\n" +
            "Общая стоимость товаров без скидки = " + (numH + numI) + " руб." + "\n" +
            "Сумма скидки = " + ((numH + numI) * numK) + " руб." + "\n" +
            "Общая стоимость товаров со скидкой = " + ((numH + numI) - ((numH + numI) * numK)) + 
            " руб." + "\n"
        );

        System.out.println("3. Вывод слово JAVA: ");
        System.out.println("    J    a   v     v   a");
        System.out.println("    J   a a   v   v   a a");
        System.out.println("J   J  aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a" + "\n");

        byte numP = 127;
        short numQ = 32767;
        int numR = 2147483647;
        long numS = 9223372036854775807l;
        System.out.println("4. Вывод min и max значений целых числовых типов: ");
        System.out.println("первоначальное значение = " + numP + "\n" +
            "значение после инкремента на единицу = " + (++numP) + "\n" +
            "значение после декремента на единицу = " + (--numP) + "\n"
        );
        System.out.println("первоначальное значение = " + numQ + "\n" +
            "значение после инкремента на единицу = " + (++numQ) + "\n" +
            "значение после декремента на единицу = " + (--numQ)+ "\n"
        );
                System.out.println("первоначальное значение = " + numR + "\n" +
            "значение после инкремента на единицу = " + (++numR) + "\n" +
            "значение после декремента на единицу = " + (--numR)+ "\n"
        );
                System.out.println("первоначальное значение = " + numS + "\n" +
            "значение после инкремента на единицу = " + (++numS) + "\n" +
            "значение после декремента на единицу = " + (--numS)+ "\n"
        );

        int numT = 2;
        int numU = 5;
        int numV;
        System.out.println("5. Перестановка значений переменных" + "\n");
        System.out.println("с помощью третьей переменной: " + "\n" + 
            "исходные значения переменных: " + "\n" +
            "numT = " + numT + "\n" +
            "numU = " + numU
        );
            numV = numU;
            numU = numT;
            numT = numV;
        System.out.println("новые значения переменных: " + "\n" +
            "numT = " + numT + "\n" +
            "numU = " + numU + "\n"
        );
        System.out.println("с помощью арифметических действий: " + "\n" + 
            "исходные значения переменных: " + "\n" +
            "numT = " + numT + "\n" +
            "numU = " + numU
        );
        System.out.println("новые значения переменных: " + "\n" +
            "numT = " + (numT + numU - numT) + "\n" +
            "numU = " + (numU + numT - numU) + "\n"
        );
        System.out.println("с помощью побитовых операций: " + "\n" + 
            "исходные значения переменных: " + "\n" +
            "numT = " + (Integer.toBinaryString(numT)) + "\n" +
            "numU = " + (Integer.toBinaryString(numU))
        );
        System.out.println("новые значения переменных: " + "\n" +
            "numT = " + (Integer.toBinaryString(numT ^ numT | numU)) + "\n" +
            "numU = " + (Integer.toBinaryString(numU ^ numU|numT)) + "\n"
        );

        int numBa = 36;
        char numBaa = '$';
        int numX = 42;
        char numXa = '*';
        int numW = 64;
        char numWa = '@';
        int numZ = 124;
        char numZa = '|';
        int numAa = 126;
        char numAaa = '~';
        System.out.println("6. Вывод символов и их кодов: " + "\n" +
            numBa + "   " + numBaa + "\n" +
            numX + "   " + numXa + "\n" +
            numW + "   " + numWa + "\n" +
            numZ + "   " + numZa + "\n" +
            numAa + "   " + numAaa + "\n" 
        );

        char numCa = '/';
        char numEa = '_';
        char numFa = '(';
        char numGa = ')';
        char numDa = ')';
        System.out.println("7. Вывод в консоль ASCII-арт Дюка: " + "\n" +
            "    " + numCa + numDa + "    " + "\n" +
            "   " + numCa + "  " + numDa + "   " + "\n" +
            "  " + numCa + numEa + numFa + " " + numGa + numDa + "\n" +
            " " + numCa + "      " + numDa + " " + "\n" +
            numCa + numEa + numEa + numEa + numEa + numCa + numDa + numEa + numEa + 
            numDa + "\n"
        );

        int numL = 123;
        int numM;
        int numN;
        int numO;
        System.out.println("8. Вывод количества сотен, десятков и единиц числа:");
        System.out.println("Число numL содержит: ");
        System.out.println("сотен - " + (numM = numL / 100));
        System.out.println("десятков - " + (numN = numL % 100 / 10));
        System.out.println("единиц - " + (numO = numL % 10 / 1));
        System.out.println("Сумма его цифр = " + (numM + numN + numO));
        System.out.println("Произведение  = " + (numM * numN * numO) + "\n");

        int sec = 86399;
        int min = (sec / 60) % 60;
        int hour = sec / 3600;
        System.out.println("9. Вывод времени: " + hour + ":" + min + ":" + (sec % 60)+ "\n");
    }
}
