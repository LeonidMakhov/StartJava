import java.util.Date;

public class VariableNamesTheme {
    public static void main(String[] arg) {
        //цифра
        int num = 2;
        System.out.println("1. цифра = " + num + "\n");

        //сумма чисел
        int sum = 40 + 14;
        System.out.println("2. сумма чисел = " + sum + "\n");

        //произведение чисел
        int mult = 20 * 2;
        System.out.println("3. произведение чисел = " + mult + "\n");

        //максимальное число
        int max = 100;
        System.out.println("4. максимальное число = " + max + "\n");

        //количество десятков
        int countTen = sum / 10;
        System.out.println("5. количество десятков = " + countTen + "\n");

        //вес собаки
        int weightDog = countTen + 4;
        System.out.println("6. вес собаки = " + weightDog + "кг"+ "\n");

        //исходное число
        int initNum = num;
        System.out.println("7. исходное число = " + initNum + "\n");

        //процент по вкладу
        int percent = 12; 
        System.out.println("8. процент по вкладу = " + percent + "%" + "\n");

        //(переменная хранит символ) &
        char symbol = '&'; 
        System.out.println("9. (переменная хранит символ) & = " + symbol + "\n");

        //код ошибки
        String error1 = "401";
        System.out.println("10. Код ошибки = " + num + "\n");

        //тип сообщения
        String message1 = "Привет Максим! Надеюсь я все делаю без ошибок";
        System.out.println("11. тип сообщения = " + message1 + "\n");

        //число нулей
        int countZero = error1.length() - error1.replaceAll("0", "").length();
        System.out.println("12. число нулей = " + countZero + "\n");

        //уникальное число
        double uniqNum = Math.random();
        System.out.println("13. уникальное число = " + uniqNum + "\n");

        //случайное число
        String randomNum = String.format("%.3f", uniqNum);
        System.out.println("14. случайное число = " + randomNum + "\n");

        //математическое выражение
        double expressionMath = Math.ceil((uniqNum + weightDog) * 12);
        System.out.println("15. математическое выражение = " + expressionMath + "\n");

        //выбор чего либо
        String choice = "Яблоко или груша ?";
        System.out.println("16. выбор чего либо = " + choice + "\n");

        //количество очков (в игре)
        int countNum2 = 5;
        System.out.println("17. количество очков (в игре) = " + countNum2 + "\n");

        //максимальная длина строки
        int maxLength = countNum2 * 5;
        System.out.println("18. максимальная длина строки = " + maxLength + "\n");

        //пункт меню
        String menu = "Свиная рулька  = 15 $";
        System.out.println("19. Пункт меню = " + menu + "\n");

        //стоимость кофе на вынос
        int costCoffee = 14;
        System.out.println("20. стоимость кофе на вынос = " + costCoffee + " $ " + "\n");

        //дата начала (чего-либо)
        Date date = new Date();
        System.out.println("21. дата начала = " + date.toString() + "\n");

        //окончание диапазона
        int theEnd = max;
        System.out.println("22. окончание диапазона = " + theEnd + "\n");

        //полное имя работника месяца
        String nameWorker = "Makhov Leonid Evg";
        System.out.println("23. полное имя работника месяца = " + nameWorker + "\n");

        //заголовок электронной книги
        String nameBook = "Garry Potter 2022";
        System.out.println("24. заголовок электронной книги = " + nameBook + "\n");

        //размер
        String size = "41";
        System.out.println("25. размер = " + size + "\n");

        //вместимость (чего либо)
        int valueObject = 45;
        System.out.println("26. вместимость (чего либо) = " + valueObject + "m3" + "\n");

        //счетчик
        int countTime = valueObject + 1;
        System.out.println("27. счетчик = " + countTime + "\n");

        //путь до файла
        String wayToFile = "D:\\Java 01.08.2023\\StartJava";
        System.out.println("28. путь до файла = " + wayToFile + "\n");

        //количество чисел в каждой строке
        long countDigits = nameBook.codePoints().filter(Character::isDigit).count();
        System.out.println("29. количество чисел в каждой строке = " + countDigits + "\n");
    
        //сотни равны? 
        Boolean egualHundred = 100 == 101;
        System.out.println("30. сотни равны? = " + egualHundred + "\n");

        //компьютер включен? 
        Boolean pcOff = false;
        System.out.println("31. компьютер включен? = " + pcOff + "\n");

        //есть равные цифры? 
        Boolean numIsNum = countNum2 == 5;
        System.out.println("32. есть равные цифры? = " + numIsNum + "\n");

        //(что-либо) создано? 
        Boolean newSome = true;
        System.out.println("33. (что-либо) создано? = " + newSome + "\n");

        //(что-либо) пусто? 
        Boolean newAmpty = true;
        System.out.println("34. (что-либо) пусто? = " + newAmpty + "\n");

        //(что-либо) активный? 
        Boolean newActiv = true;
        System.out.println("35. (что-либо) активный? = " + newActiv + "\n");

        //новый? 
        Boolean newSomth = true;
        System.out.println("36. новый? = " + newSomth + "\n");

        //электронная почта действительная? 
        Boolean emailWorks = true;
        System.out.println("37. электронная почта действительная? = " + emailWorks + "\n");

        //имеются уникальные строки? 
        Boolean unigStrings = false;
        System.out.println("38. имеются уникальные строки? = " + unigStrings + "\n");

        //старый universally unique identifier 
        String name = "UUI";
        System.out.println("39. старый universally unique identifier = " + name + "\n");

        //производитель оперативной памяти 
        String productBy = "Xerox";
        System.out.println("40. производитель оперативной памяти = " + productBy + "\n");

        //емкость жесткого диска 
        String valueIDD = "FAT32";
        System.out.println("41. емкость жесткого диска = " + valueIDD + "\n");

        //протокол передачи гипертекста 
        String protocol = "TCP/IP";
        System.out.println("42. протокол передачи гипертекста = " + protocol + "\n");

        //сокращенный uniform resource locator
        String nameTwo = "URL";
        System.out.println("43. сокращенный uniform resource locator = " + nameTwo + "\n");

        //новый идентификатор клиента 
        String postCode = "POST CODE";
        System.out.println("44. новый идентификатор клиента = " + postCode + "\n");

        //кодировка american standard code for information interchange 
        String codeInform = "ASCII";
        System.out.println("45. кодировка american standard code for information interchange = " + codeInform + "\n");

    }
}
