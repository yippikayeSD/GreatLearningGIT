public class App {
    class Customer{
        int age;
        String fullName;
    }
    public static void main(String[] args) throws Exception {

        App newObject= new App();
        Customer customer1 = newObject.new Customer();
        customer1.fullName = "Ashutosh Rana";
        customer1.age = 48;

        System.out.println("Hello, World! The age of "+customer1.fullName+" is "+customer1.age);
    }
}
