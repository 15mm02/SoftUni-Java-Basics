import java.util.Scanner;

public class YardGreening_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yardSize = Double.parseDouble(scanner.nextLine());

        double yardPrice = yardSize *7.61;
        double discount = yardPrice * 0.18;

        double finalPrice =yardPrice + yardSize - discount;

        System.out.println("final price is:" +finalPrice + "lv" );
        System.out.println("The diskount is" + discount + "lv");




    }
}
