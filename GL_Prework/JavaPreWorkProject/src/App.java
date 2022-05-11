import java.util.Scanner;

public class App {

    public void printString() {
        System.out.println("Hello Great Learning");
    }

    public void performAddition(int firstNumber, int secondNumber) {
        System.out.println("The sum of " + firstNumber +
                " and " + secondNumber + " is : " +
                (int) (firstNumber + secondNumber));
    }

    public void performSubtraction(int firstNumber, int secondNumber) {
        System.out.println("The differnce of " + firstNumber +
                " and " + secondNumber + " is : " +
                (int) (firstNumber - secondNumber));
    }

    public void performMultiplication(int firstNumber, int secondNumber) {
        System.out.println("The product of " + firstNumber +
                " and " + secondNumber + " is : " +
                (int) (firstNumber * secondNumber));
    }

    public void performDivision(int firstNumber, int secondNumber) {
        System.out.println("The quotient of " + firstNumber +
                " and " + secondNumber + " is : " +
                (int) (firstNumber / secondNumber));
    }

    public void calculatorMain() {
        App newApp = new App();
        int firstNumber = 0, secondNumber = 0, opCode = 0;
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Hi! Welcome to a Simple calculator App for performing Addition of Two Numbers.");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Please enter first number");
            firstNumber = inputScanner.nextInt();
            System.out.println("Please enter second number");
            secondNumber = inputScanner.nextInt();
            System.out.println("Please Select Operation from the list:");
            System.out.println("Please Select 1 for Addition");
            System.out.println("Please Select 2 for Subtraction");
            System.out.println("Please Select 3 for Multiplication");
            System.out.println("Please Select 4 for Division");
            opCode = inputScanner.nextInt();
            switch (opCode) {
                case 1:
                    newApp.performAddition(firstNumber, secondNumber);
                    break;
                case 2:
                    newApp.performSubtraction(firstNumber, secondNumber);
                    break;
                case 3:
                    newApp.performMultiplication(firstNumber, secondNumber);
                    break;
                case 4:
                    newApp.performDivision(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("please enter a valid Operation Code");

            }
            ;
        } catch (Exception e) {
            System.out.println("Error Occured: " + e);
        }

    }

    public void patternMaker(){
        System.out.println("Please enter a random number between 1 and 5 to see a random pattern");
        try (Scanner patternScanner = new Scanner (System.in)) {
            int patternCode = patternScanner.nextInt();
            switch(patternCode){
                case 1:
                for (int row =0; row<10; row++){
                    for (int col = 0; col <row; col++){
                        System.out.print("*");
                    }
                    
                    System.out.println();
                }
                break;
                case 2:
                for (int row =0; row<10; row++){
                    for (int space = 0; space <(10-row)/2; space++){
                        System.out.print(" ");
                    }
                    for (int col = 10-row; col >0 ; col--){
                        System.out.print("x");
                    }
                    System.out.println();
                }
                break;
                
            }
        }catch (Exception e){
            System.out.println("Error Occured : "+e);
        }

    }

    public static void main(String[] args) throws Exception {

        App newAppMain = new App();

        // newAppMain.calculatorMain();
        newAppMain.patternMaker();
    }
}
