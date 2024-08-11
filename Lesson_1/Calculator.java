public class Calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        char mathOperation = '^';
        if (mathOperation == '+') {
            System.out.println(firstNum + secondNum);
        } else if (mathOperation == '-') {
            System.out.println(firstNum - secondNum);
        } else if (mathOperation == '*') {
            System.out.println(firstNum * secondNum);
        } else if (mathOperation == '/') {
            System.out.println(firstNum / secondNum);
        } else if (mathOperation == '%') {
            System.out.println(firstNum % secondNum);
        } else if (mathOperation == '^') {
            if (secondNum == 0) {
                System.out.println(1);
            }
            int result = 1;
            for (int i = 0; i < secondNum; i++) {
                result = result * firstNum;
            }
            System.out.println(result);
        }
    }
}