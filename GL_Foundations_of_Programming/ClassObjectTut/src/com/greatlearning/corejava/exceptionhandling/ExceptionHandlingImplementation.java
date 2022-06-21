package com.greatlearning.corejava.exceptionhandling;
/*
 * ====================Exception ===============
 *      ->An event that occurs during the execution of the program 
 *          disrupts the flow of execution of the program
 *      Normal Flow -> Sequemtial execution of all the instructions which are written in the program.
 *      ->Exception tries to halt the normal flow of program instructions
 *      ->Exceptions can lead to abnormal program termination
 *      ->Exceptions occur mostly due to proggramers fault. 
 *          -forgot to handle a situation
 *          -using illegal or incorect statement or accesig an unauthorised area of program
 * 
 *      ->Example: SimpleExceptionDemo
 *      ->Exception tells you:
 *          -what tye of exception
 *          -where it has occured: 
 *              *thread
 *              *line number
 *              *col
 * 
 *      =>Exception Stack Trace -> 
 *          ->a stack of different commands where the last line will show you where
 *             the exception started from
 * 
 *      ->The program abruptly terminates at the line where exception occurs
 *
 * 
 * *********--------Error------------************
 *       -> Caused by:
 *              -environment
 *              -external factors
 *              -H/W and VM failures
 *       -> Not Caused By Program Usually
 *       -> Errors can't and also shouldn't be handeled by the developer
 * 
 * 
 * =====>Difference between Error & Exception<=========
 *      => Exception: an abnormal execution path 
 *                  ->occured by developer's mistake
 *                  ->developer should try to handle each and every possible scenario of exception occurence
 *      => Error: an unexpected failure outside the purview of program
 *                  -> caused by external factors
 *                  -> Can't and shouldn't be handled by users
 *      => Similarity
 *          -> Both are subclassses of Throwable super class present in java.lang package
 *          ->---------------All Objects that we create in java or are provided by default are all Throwable
 *      => Types of error
 *          -> Compile time error:
 *                  -Syntactical errors: Checked at complie time
 *                  - eg String s = 123;
 *                  - Happens due to devleper's negligence
 *                  -can be controlled by the developer
 * 
 *          -> Logical Error:
 *                  - Sematic error: doesn't break your program 
 *                  - invokes unpredictable behivour from the program
 *                  - Happens due to devleper's negligence
 *                  - can be controlled by the developer
 * 
 * 
 *          -> Runtime Error:
 *                  - JVM crashes
 *                  - HDD crash
 *                  - RAM flushed
 *                  - CPU Cycle dies
 *                  - Such errors are not i controll of the developer
 *                  - Most such errors can't be fixed by developer
 *                  - 
 * 
 */


class SimpleExceptionDemo{
    SimpleExceptionDemo(int a){
        System.out.println(a/0);
    }
}
class StringExceptionDemo{
    String name = null;
    StringExceptionDemo(){
        System.out.println(name.charAt(0));
    }
}



public class ExceptionHandlingImplementation {
    

    public static void main(String[] args) {

        /*
         * =============>Exception Handling 
         *  ->Process of handeling the exception so that the normal flow of 
         *      the program doesn't get interrupted
         *  ->Developer needs to explicitly protect the code against exception
         *  
         *  =>Exception Object
         *      ->Exception()
         *          - very rare
         *          - doesn't have a message or name of exception
         *          - very hard to handle
         *      ->Exception(String message)
         *          - fairly common
         *          - informs the java developer about what is wrong
         *          - ArrayIndexOUtOFBound 
         *          - DivideByZeroException
         *      ->Exception(String message,  Throwable t)
         *          - Most common
         *          - Most informative Exception Object
         *          - Contains the complete exception stack trace inside the Throwable Object
         *          - Exception Stack Trace:
         *              - Contains line by line events how the exception occured
         *              - Last line says: Caused BY: java program line along with line number
         *  =>Exception Handeling Flow
         *      ->Program Starts
         *      ->Executes some lines
         *      ->Execution of protected code begins
         *          ->Developer has doubt that this code can generating exception
         *      ->Exception is handeled
         *      ->Program resumes execution without breaking flow
         *  =>Exception Type
         *      -> Checked: -checked at compile time. 
         *                  -Direct child classes of Exception class
         *                  -Developer should handle the exception or specify it using throws keyword
         *      ->Unchecked:-Not checked at compile time. 
         *                  -Exceptions under Error and RuntimeException classes
         *      -> User Defined Exceptions:
         *                  -Custom checked exception by extending the Exception Class 
         *                  -Custom uncheked exception by extending the RuntimeException Class
        */


        // SimpleExceptionDemo obj = new SimpleExceptionDemo(45);
        //StringExceptionDemo objString = new StringExceptionDemo();
        try {
            throw new CustomException("Custom Exception Occured");
        } catch (CustomException e) {
            //Since this extends Exception, it has to be
            // explicitly handled as it becomes checked exception
            e.printStackTrace();
        }


    }

}


