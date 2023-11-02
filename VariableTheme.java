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
    }
}
