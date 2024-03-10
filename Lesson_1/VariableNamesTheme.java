import java.util.Date;

public class VariableNamesTheme {
    public static void main(String[] arg) {
        System.out.println("1. Разные переменные");
        //цифра
        int num = 2;
        System.out.println("цифра = " + num);

        //сумма чисел
        int sumNumbers = 40 + 14;
        System.out.println("сумма чисел = " + sumNumbers);

        //произведение чисел
        int multiplyingNumbers = 20 * 2;
        System.out.println("произведение чисел = " + multiplyingNumbers);

        //максимальное число
        int maximumNumber = 100;
        System.out.println("максимальное число = " + maximumNumber);

        //количество десятков
        int numberTens = sumNumbers / 10;
        System.out.println("количество десятков = " + numberTens);

        //вес собаки
        int weightDog = numberTens + 4;
        System.out.println("вес собаки = " + weightDog + "кг");

        //исходное число
        int originalNumber = num;
        System.out.println("исходное число = " + originalNumber);

        //процент по вкладу
        int interestOnDeposit = 12; 
        System.out.println("процент по вкладу = " + interestOnDeposit + "%");

        //(переменная хранит символ) &
        char symbolAnd = '&'; 
        System.out.println("(переменная хранит символ) & = " + symbolAnd);

        //код ошибки
        String errorCode = "401";
        System.out.println("Код ошибки = " + errorCode);

        //тип сообщения
        String messageType = "Привет Максим! Надеюсь я все делаю без ошибок";
        System.out.println("тип сообщения = " + messageType);

        //число нулей
        int numberZeros = errorCode.length() - errorCode.replaceAll("0", "").length();
        System.out.println("число нулей = " + numberZeros);

        //уникальное число
        double uniqueNumber = Math.random();
        System.out.println("уникальное число = " + uniqueNumber);

        //случайное число
        String randomNumber = String.format("%.3f", uniqueNumber);
        System.out.println("случайное число = " + randomNumber);

        //математическое выражение
        double expressionMath = Math.ceil((uniqueNumber + weightDog) * 12);
        System.out.println("математическое выражение = " + expressionMath);

        //выбор чего либо
        String choiceSomething = "Яблоко или груша ?";
        System.out.println("выбор чего либо = " + choiceSomething);

        //количество очков (в игре)
        int numberPoints = 5;
        System.out.println("количество очков (в игре) = " + numberPoints);

        //максимальная длина строки
        int maximumLineLength = numberPoints * 5;
        System.out.println("максимальная длина строки = " + maximumLineLength);

        //пункт меню
        String menuItem = "Свиная рулька  = 15 $";
        System.out.println("Пункт меню = " + menuItem);

        //стоимость кофе на вынос
        int costCoffeeTakeAway = 14;
        System.out.println("стоимость кофе на вынос = " + costCoffeeTakeAway + " $");

        //дата начала (чего-либо)
        Date dateSomething = new Date();
        System.out.println("дата начала = " + dateSomething.toString());

        //окончание диапазона
        int endRange = maximumNumber;
        System.out.println("окончание диапазона = " + endRange);

        //полное имя работника месяца
        String fullWorkerName = "Makhov Leonid Evg";
        System.out.println("полное имя работника месяца = " + fullWorkerName);

        //заголовок электронной книги
        String titleEbook = "Garry Potter 2022";
        System.out.println("заголовок электронной книги = " + titleEbook);

        //размер
        String size = "41";
        System.out.println("размер = " + size);

        //вместимость (чего либо)
        int capacitySomething = 45;
        System.out.println("вместимость (чего либо) = " + capacitySomething + "m3");

        //счетчик
        int counter = capacitySomething + 1;
        System.out.println("счетчик = " + counter);

        //путь до файла
        String pathFile = "D:\\Java 01.08.2023\\StartJava";
        System.out.println("путь до файла = " + pathFile);

        //количество чисел в каждой строке
        long numberNumbersEachLine = titleEbook.codePoints().filter(Character::isDigit).count();
        System.out.println("количество чисел в каждой строке = " + numberNumbersEachLine + "\n");
    
        System.out.println("2. boolean-переменные");

        //сотни равны? 
        boolean isEgualHundred = 100 == 101;
        System.out.println("сотни равны? = " + isEgualHundred);

        //компьютер включен? 
        boolean isPcOff = false;
        System.out.println("компьютер включен? = " + isPcOff);

        //есть равные цифры? 
        boolean isEqualNumbers = numberPoints == 5;
        System.out.println("есть равные цифры? = " + isEqualNumbers);

        //(что-либо) создано? 
        boolean isSomeNew = true;
        System.out.println("(что-либо) создано? = " + isSomeNew);

        //(что-либо) пусто? 
        boolean isSomeAmpty = true;
        System.out.println("(что-либо) пусто? = " + isSomeAmpty);

        //(что-либо) активный? 
        boolean isSomeActiv = true;
        System.out.println("(что-либо) активный? = " + isSomeActiv);

        //новый? 
        boolean isSomethingNew = true;
        System.out.println("новый? = " + isSomethingNew);

        //электронная почта действительная? 
        boolean isEmailWorks = true;
        System.out.println("электронная почта действительная? = " + isEmailWorks);

        //имеются уникальные строки? 
        boolean isUnigStrings = false;
        System.out.println("имеются уникальные строки? = " + isUnigStrings + "\n");

        System.out.println("3. Аббревиатуры");

        //старый universally unique identifier 
        String oldUniversallyUniqueIdentifier = "UUI";
        System.out.println("старый universally unique identifier = " + 
            oldUniversallyUniqueIdentifier);

        //производитель оперативной памяти 
        String ramManufacturer = "Xerox";
        System.out.println("производитель оперативной памяти = " + ramManufacturer);

        //емкость жесткого диска 
        String valueIdd = "FAT32";
        System.out.println("емкость жесткого диска = " + valueIdd);

        //протокол передачи гипертекста 
        String hypertextTransferProtocol = "TCP/IP";
        System.out.println("протокол передачи гипертекста = " + hypertextTransferProtocol);

        //сокращенный uniform resource locator
        String abbreviatedUniformResourceLocator = "URL";
        System.out.println("сокращенный uniform resource locator = " + 
            abbreviatedUniformResourceLocator);

        //новый идентификатор клиента 
        String newClientId = "POST CODE";
        System.out.println("новый идентификатор клиента = " + newClientId);

        //кодировка american standard code for information interchange 
        String americanStandardCodeForInformationInterchange = "ASCII";
        System.out.println("кодировка american standard code for information interchange = " + 
            americanStandardCodeForInformationInterchange);

    }
}
