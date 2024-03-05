import java.util.Date;

public class VariableNamesTheme {
    public static void main(String[] arg) {
        //цифра
        int num = 2;
        System.out.println("1. цифра = " + num + "\n");

        //сумма чисел
        int sumNumbers = 40 + 14;
        System.out.println("2. сумма чисел = " + sumNumbers + "\n");

        //произведение чисел
        int multiplyingNumbers = 20 * 2;
        System.out.println("3. произведение чисел = " + multiplyingNumbers + "\n");

        //максимальное число
        int maximumNumber = 100;
        System.out.println("4. максимальное число = " + maximumNumber + "\n");

        //количество десятков
        int numberTens = sumNumbers / 10;
        System.out.println("5. количество десятков = " + numberTens + "\n");

        //вес собаки
        int weightDog = numberTens + 4;
        System.out.println("6. вес собаки = " + weightDog + "кг\n");

        //исходное число
        int originalNumber = num;
        System.out.println("7. исходное число = " + originalNumber + "\n");

        //процент по вкладу
        int interestOnDeposit = 12; 
        System.out.println("8. процент по вкладу = " + interestOnDeposit + "%\n");

        //(переменная хранит символ) &
        char symbolAnd = '&'; 
        System.out.println("9. (переменная хранит символ) & = " + symbolAnd + "\n");

        //код ошибки
        String errorCode = "401";
        System.out.println("10. Код ошибки = " + errorCode + "\n");

        //тип сообщения
        String messageType = "Привет Максим! Надеюсь я все делаю без ошибок";
        System.out.println("11. тип сообщения = " + messageType + "\n");

        //число нулей
        int numberZeros = errorCode.length() - errorCode.replaceAll("0", "").length();
        System.out.println("12. число нулей = " + numberZeros + "\n");

        //уникальное число
        double uniqueNumber = Math.random();
        System.out.println("13. уникальное число = " + uniqueNumber + "\n");

        //случайное число
        String randomNumber = String.format("%.3f", uniqueNumber);
        System.out.println("14. случайное число = " + randomNumber + "\n");

        //математическое выражение
        double expressionMath = Math.ceil((uniqueNumber + weightDog) * 12);
        System.out.println("15. математическое выражение = " + expressionMath + "\n");

        //выбор чего либо
        String choiceSomething = "Яблоко или груша ?";
        System.out.println("16. выбор чего либо = " + choiceSomething + "\n");

        //количество очков (в игре)
        int numberPoints = 5;
        System.out.println("17. количество очков (в игре) = " + numberPoints + "\n");

        //максимальная длина строки
        int maximumLineLength = numberPoints * 5;
        System.out.println("18. максимальная длина строки = " + maximumLineLength + "\n");

        //пункт меню
        String menuItem = "Свиная рулька  = 15 $";
        System.out.println("19. Пункт меню = " + menuItem + "\n");

        //стоимость кофе на вынос
        int costCoffeeTakeAway = 14;
        System.out.println("20. стоимость кофе на вынос = " + costCoffeeTakeAway + " $\n");

        //дата начала (чего-либо)
        Date dateSomething = new Date();
        System.out.println("21. дата начала = " + dateSomething.toString() + "\n");

        //окончание диапазона
        int endRange = maximumNumber;
        System.out.println("22. окончание диапазона = " + endRange + "\n");

        //полное имя работника месяца
        String fullWorkerName = "Makhov Leonid Evg";
        System.out.println("23. полное имя работника месяца = " + fullWorkerName + "\n");

        //заголовок электронной книги
        String titleEbook = "Garry Potter 2022";
        System.out.println("24. заголовок электронной книги = " + titleEbook + "\n");

        //размер
        String size = "41";
        System.out.println("25. размер = " + size + "\n");

        //вместимость (чего либо)
        int capacitySomething = 45;
        System.out.println("26. вместимость (чего либо) = " + capacitySomething + "m3\n");

        //счетчик
        int counter = capacitySomething + 1;
        System.out.println("27. счетчик = " + counter + "\n");

        //путь до файла
        String pathFile = "D:\\Java 01.08.2023\\StartJava";
        System.out.println("28. путь до файла = " + pathFile + "\n");

        //количество чисел в каждой строке
        long numberNumbersEachLine = titleEbook.codePoints().filter(Character::isDigit).count();
        System.out.println("29. количество чисел в каждой строке = " + numberNumbersEachLine + "\n");
    
        //сотни равны? 
        boolean isEgualHundred = 100 == 101;
        System.out.println("30. сотни равны? = " + isEgualHundred + "\n");

        //компьютер включен? 
        boolean isPcOff = false;
        System.out.println("31. компьютер включен? = " + isPcOff + "\n");

        //есть равные цифры? 
        boolean isEqualNumbers = numberPoints == 5;
        System.out.println("32. есть равные цифры? = " + isEqualNumbers + "\n");

        //(что-либо) создано? 
        boolean isSomeNew = true;
        System.out.println("33. (что-либо) создано? = " + isSomeNew + "\n");

        //(что-либо) пусто? 
        boolean isSomeAmpty = true;
        System.out.println("34. (что-либо) пусто? = " + isSomeAmpty + "\n");

        //(что-либо) активный? 
        boolean isSomeActiv = true;
        System.out.println("35. (что-либо) активный? = " + isSomeActiv + "\n");

        //новый? 
        boolean isSomethingNew = true;
        System.out.println("36. новый? = " + isSomethingNew + "\n");

        //электронная почта действительная? 
        boolean isEmailWorks = true;
        System.out.println("37. электронная почта действительная? = " + isEmailWorks + "\n");

        //имеются уникальные строки? 
        boolean isUnigStrings = false;
        System.out.println("38. имеются уникальные строки? = " + isUnigStrings + "\n");

        //старый universally unique identifier 
        String oldUniversallyUniqueIdentifier = "UUI";
        System.out.println("39. старый universally unique identifier = " + 
            oldUniversallyUniqueIdentifier + "\n");

        //производитель оперативной памяти 
        String ramManufacturer = "Xerox";
        System.out.println("40. производитель оперативной памяти = " + ramManufacturer + "\n");

        //емкость жесткого диска 
        String valueIdd = "FAT32";
        System.out.println("41. емкость жесткого диска = " + valueIdd + "\n");

        //протокол передачи гипертекста 
        String hypertextTransferProtocol = "TCP/IP";
        System.out.println("42. протокол передачи гипертекста = " + hypertextTransferProtocol + "\n");

        //сокращенный uniform resource locator
        String abbreviatedUniformResourceLocator = "URL";
        System.out.println("43. сокращенный uniform resource locator = " + 
            abbreviatedUniformResourceLocator + "\n");

        //новый идентификатор клиента 
        String newClientId = "POST CODE";
        System.out.println("44. новый идентификатор клиента = " + newClientId + "\n");

        //кодировка american standard code for information interchange 
        String americanStandardCodeForInformationInterchange = "ASCII";
        System.out.println("45. кодировка american standard code for information interchange = " + 
            americanStandardCodeForInformationInterchange + "\n");

    }
}
