package edu.handong.csee.java.hw2.util;

/**
 * This class is a class which find error that user input data. 
 */
public class InputChecker {

    /**
     * This method is a method which find error that user don't input satisfied number of data required data.
     * @param engineName
     * @param numOfRequiredInputs
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * This method is a method which find error that user input negative data.
     * @param engineName
     */
    public static void printErrorMesssageForNegativeInputsAndExit(String engineName){
        System.out.println("The input value cannot be negative for "+engineName+".");
    }

    /**
     * This method is also method which find error that user don't input satisfied number of data required data.
     * @param engineName
     * @param numOfRequiredInputs
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExitLCM(String engineName, int numOfRequiredInputs){
        System.out.println("You need at least " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(0);
    }

    /**
     * This method is also method which find error that user don't input any data in args array.
     */
    public static void printErrorMesssageForTheNumberOfRequiredInputsAndExitMain(){
        System.out.println("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL.\nFor example, java -cp [your classpath] edu.handong.csee.java.hw2.Calculator MAX 12 4 5 45 100");
    }
}
