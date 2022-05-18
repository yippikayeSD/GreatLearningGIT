import java.util.Scanner;

import javax.xml.crypto.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class App {

    // Creating the inital menu display method
    private void displayMenu(){
        boolean showMenu = true;
        int option = 99;
        Scanner optionScanner = new Scanner ( System.in);
        App emailApp = new App();
        do {
            
            System.out.println("Welcome to the dummy E-mail Client!!");
            System.out.println("Please select an option from the list to continue...");
            System.out.println("Press 1 to Create New Email ID");
            System.out.println("Press 2 to Change Password");
            System.out.println("Press 3 to Display List of existing Email IDs");
            System.out.println("Press 0 to exit");

            //Accepting user input
            option = optionScanner.nextInt();

            //switch case for determining flow of control on basis of option selected by user
            switch (option) {
                case 0:
                    System.out.println("Thanks for using the Email App. Please visit again!!");
                    showMenu = false;
                    break;
                case 1:
                    emailApp.createEmail();
                    break;
                case 2:
                    emailApp.changePassword();
                    break;
                case 3:
                    emailApp.displayEmails();
                    break;
            
                default:
                    System.out.println("Please enter correct option!");
                    break;
            }




        } while (showMenu);
    }
    
    private void createEmail() {
        try {
            Scanner emailScanner = new Scanner(System.in);
            System.out.println("Please enter new Email ID!!");
            String newEmail = emailScanner.nextLine();
            String emailFileData="";
            File emailFile = new File("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\emailList.txt");
            Scanner fileReader = new Scanner (emailFile);
             while(fileReader.hasNextLine()){
                 emailFileData += fileReader.nextLine()+"\n";

             }
            FileWriter emailFileWriter = new FileWriter("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\emailList.txt");
            emailFileWriter.write(emailFileData+newEmail+"\n");
            emailFileWriter.close();
            System.out.println("Email is succesfully created !!");
                       
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error Occuredd:" + e.getMessage());
        }

    }



    private void changePassword() {
        System.out.println("Hi, This option is under maintainance. It will soon be released for users.");
    }



    private void displayEmails() {
        try {
            File emailFile = new File("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\emailList.txt");
            Scanner fileReader = new Scanner (emailFile);
            System.out.println("The List of Email in the Database are: ");
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("Error Occured: "+ e.getMessage());
        }
        // System.out.println("displayed");
    }


    public static void main(String[] args) throws Exception {
        App emailAppMain = new App();
        emailAppMain.displayMenu();
    }
}
