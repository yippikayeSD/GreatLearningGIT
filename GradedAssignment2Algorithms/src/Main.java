import problems.DenominationForTravel;
import problems.PayMoney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean isTrue = true;
        do {
            System.out.println("---------------- Welcome to Graded Assignment Lab 2 - Algorithm -----------------");
            System.out.println("Please enter problem number");
            System.out.println("1. PayMoney");
            System.out.println("2. Denomination for Travel");
            System.out.println("3. Quit");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    PayMoney payMoney = new PayMoney();
                    break;
                case 2:
                    DenominationForTravel denomination = new DenominationForTravel();
                    break;
                default:
                    System.out.println("----------------Process Finished. Bye!!-------------" );
                    isTrue = false;

            }
        } while(isTrue);
    }
}