public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 50;
        int myMumber = 70;
        while (computerNumber != myMumber) { //while (true)
            if (myMumber > computerNumber) {
                System.out.println(myMumber + " больше того, что загадал компьютер");
                myMumber--;
            } 
            if (myMumber < computerNumber) {
                System.out.println(myMumber + " меньше того, что загадал компьютер");
                myMumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}