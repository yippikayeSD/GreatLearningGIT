import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

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
            // optionScanner.close();

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
        /*
        try {
            Scanner emailScanner = new Scanner(System.in);
            System.out.println("Please enter new Email ID!!");
            String newEmail = emailScanner.nextLine();
            emailScanner.close();
            String emailFileData="";
            File emailFile = new File("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\emailList.txt");
            Scanner fileReader = new Scanner (emailFile);
            while(fileReader.hasNextLine()){
                 emailFileData += fileReader.nextLine()+"\n";

             }
            fileReader.close();
            FileWriter emailFileWriter = new FileWriter("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\emailList.txt");
            emailFileWriter.write(emailFileData+newEmail+"\n");
            emailFileWriter.close();
            System.out.println("Email is succesfully created !!");
                       
        } catch (Exception e) {
            
            System.out.println("Error Occurred:" + e.getMessage());
        }
        */
        try {
            Scanner userScanner = new Scanner(System.in);
            
            System.out.println("Please Enter First Name!!");
            String firstName = userScanner.nextLine();
            System.out.println("Please Enter Last Name");
            String lastName = userScanner.nextLine();
            System.out.println("Please Enter Email");
            String email = userScanner.nextLine();
            System.out.println("Please Enter Password");
            String password = userScanner.nextLine();
                        
            JSONObject user = new JSONObject();
            user.put("First Name", firstName);
            user.put("Last Name", lastName);
            user.put( "Password", password);
            user.put( "Email", email);

            Object userDetails = (Object) new JSONParser().parse(new FileReader(".\\lib\\email.JSON"));
            JSONArray allUsers = (JSONArray) userDetails;
            allUsers.add(user);
            
            PrintWriter userWriter = new PrintWriter("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\email.JSON");
            userWriter.write(allUsers.toJSONString());
            userWriter.close();

            System.out.println("User Created Succesfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error Occured, File Not Found: "+ e.getMessage()+ "The reason is: "+e.getCause().toString());
        }catch (ParseException e) {
            System.out.println("Error Occured, Unable to Parse: "+ e.getMessage()+ "The reason is: "+e.getCause().toString());
        }catch(IOException e){
            System.out.println("Error Occured, I/O Exception: "+ e.getStackTrace());
        }


    }



    private void changePassword() {
        System.out.println("Hi, This option is under maintainance. It will soon be released for users.");
    }



    private void displayEmails() {
        /*
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
            System.out.println("Error Occured: "+ e.getMessage());
        }
        
        */
        try {
            Object emailJsonObject =  new JSONParser().parse(new FileReader("C:\\Users\\DXYT\\GreatLearningGIT\\GreatLearningGIT\\GL_Prework\\emailServer\\emailServerClientDumy\\lib\\email.JSON"));
            JSONArray userList = (JSONArray) emailJsonObject;
            System.out.println("======================================================>");
            int userCount = 1;
            for (Object user : userList) {
               
                JSONObject userJSON = (JSONObject) user;
                System.out.println("User Number: "+userCount);
                String firstName = (String) userJSON.get("First Name");
                String lastName = (String) userJSON.get("Last Name");
                String password = (String) userJSON.get("Password");
                String email = (String) userJSON.get("Email");
                System.out.println("Name : " + firstName +  " "+ lastName);
                System.out.println("Email: "+ email);
                System.out.println("Password: "+ password);
                System.out.println("======================================================>");
                userCount++;
               
              
            }

        } catch (Exception e) {
            System.out.println("Error Occured while retrieving data from JSON File: "+ e.getMessage());
        }
    }


    public static void main(String[] args) throws Exception {
        App emailAppMain = new App();
        emailAppMain.displayMenu();
    }
}
