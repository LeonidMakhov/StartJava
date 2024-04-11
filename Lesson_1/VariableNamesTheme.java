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
        int maxNumber = 100;
        System.out.println("максимальное число = " + maxNumber);

        //количество десятков
        int numberTens = sumNumbers / 10;
        System.out.println("количество десятков = " + numberTens);

        //вес собаки
        int dogWeight = numberTens + 4;
        System.out.println("вес собаки = " + dogWeight + "кг");

        //исходное число
        int originalNumber = num;
        System.out.println("исходное число = " + originalNumber);

        //процент по вкладу
        int interestOnDeposit = 12; 
        System.out.println("процент по вкладу = " + interestOnDeposit + "%");

        //(переменная хранит символ) &
        char ampersand = '&'; 
        System.out.println("& = " + ampersand);

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
        double mathExpression = Math.ceil((uniqueNumber + dogWeight) * 12);
        System.out.println("математическое выражение = " + mathExpression);

        //выбор чего либо
        String choice = "Яблоко или груша ?";
        System.out.println("выбор = " + choice);

        //количество очков (в игре)
        int points = 5;
        System.out.println("количество очков = " + points);

        //максимальная длина строки
        int maxLineLength = points * 5;
        System.out.println("максимальная длина строки = " + maxLineLength);

        //пункт меню
        String menuItem = "Свиная рулька  = 15 $";
        System.out.println("Пункт меню = " + menuItem);

        //стоимость кофе на вынос
        int costCoffeeTakeAway = 14;
        System.out.println("стоимость кофе на вынос = " + costCoffeeTakeAway + " $");

        //дата начала (чего-либо)
        Date startData = new Date();
        System.out.println("дата начала = " + startData.toString());

        //окончание диапазона
        int endRange = maxNumber;
        System.out.println("окончание диапазона = " + endRange);

        //полное имя работника месяца
        String fullNameEmployeeWorker = "Makhov Leonid Evg";
        System.out.println("полное имя работника месяца = " + fullNameEmployeeWorker);

        //заголовок электронной книги
        String ebookTitle = "Garry Potter 2022";
        System.out.println("заголовок электронной книги = " + ebookTitle);

        //размер
        String size = "41";
        System.out.println("размер = " + size);

        //вместимость (чего либо)
        int capacity = 45;
        System.out.println("вместимость = " + capacity + "m3");

        //счетчик
        int counter = capacity + 1;
        System.out.println("счетчик = " + counter);

        //путь до файла
        String pathFile = "D:\\Java 01.08.2023\\StartJava";
        System.out.println("путь до файла = " + pathFile);

        //количество чисел в каждой строке
        long numberNumbersEachLine = ebookTitle.codePoints().filter(Character::isDigit).count();
        System.out.println("количество чисел в каждой строке = " + numberNumbersEachLine + "\n");

        System.out.println("2. boolean-переменные");

        //сотни равны? 
        boolean isEqualHundreds = 100 == 101;
        System.out.println("сотни равны? = " + isEqualHundreds);

        //компьютер включен? 
        boolean isPcOn = false;
        System.out.println("компьютер включен? = " + isPcOn);

        //есть равные цифры? 
        boolean hasEqualNumbers = points == 5;
        System.out.println("есть равные цифры? = " + hasEqualNumbers);

        //(что-либо) создано? 
        boolean create = true;
        System.out.println("создано? = " + create);

        //(что-либо) пусто? 
        boolean empty = true;
        System.out.println("пусто? = " + empty);

        //(что-либо) активный? 
        boolean active = true;
        System.out.println("активный? = " + active);

        //новый? 
        boolean isNew = true;
        System.out.println("новый? = " + isNew);

        //электронная почта действительная? 
        boolean isValidEmail = true;
        System.out.println("электронная почта действительная? = " + isValidEmail);

        //имеются уникальные строки? 
        boolean hasUniqueStrings = false;
        System.out.println("имеются уникальные строки? = " + hasUniqueStrings + "\n");

        System.out.println("3. Аббревиатуры");

        //старый universally unique identifier 
        String oldUUI = "oldUUI";
        System.out.println("старый universally unique identifier = " + oldUUI);

        //производитель оперативной памяти 
        String ramManufacturer = "Xerox";
        System.out.println("производитель оперативной памяти = " + ramManufacturer);

        //емкость жесткого диска 
        String hddValue = "FAT32";
        System.out.println("емкость жесткого диска = " + hddValue);

        //протокол передачи гипертекста 
        String hTTP = "TCP/IP";
        System.out.println("протокол передачи гипертекста = " + hTTP);

        //сокращенный uniform resource locator
        String shortURL = "URL";
        System.out.println("сокращенный uniform resource locator = " + shortURL);

        //новый идентификатор клиента 
        String newClientId = "POST CODE";
        System.out.println("новый идентификатор клиента = " + newClientId);

        //кодировка american standard code for information interchange 
        String americanSCFII = "ASCII";
        System.out.println("кодировка american standard code for information interchange = " + 
                americanSCFII);
    }
}
