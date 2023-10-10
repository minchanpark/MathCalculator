package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
import java.lang.Math;

/**
 * This SQRTEngine class is class that calculate square root. and this class is included required method.
 */
public class SQRTEngine implements Computable {
    private static final String engineName ="SQRT";
    private double input;
    private double result;

    /**
     * This method that return engineName "SQRT".
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }

     /**
     * This is method that bring args array from main method to Calculate class.
     */
    public void setInput(String[] args) {
        if(args.length>2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
            System.exit(0);
        }
        else if(Integer.parseInt(args[1])<0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            System.exit(0);
        }
        else if(Integer.parseInt(args[1])==0){
            setInput(0);
        }
        else{
            setInput(Double.parseDouble(args[1]));
        }
    }
    /**
    * This is method that calculate square root.
    */
    public void compute(){
        setResult(Math.sqrt(input));
    }

    /**
     * This method that return engineName "SQRT".
     * @return
     */
    public String getEngineName(){
        return engineName;
    }

     /**
     * This method that return result.
     */
    public double getResult(){
        return result;
    }
    /**
     * This method that set this.result by result in field.
     * @param result
     */
    public void setResult(double result){
        this.result=result;
    }

    /**
     * This method that return input array
     * @return
     */
    public double getInput() {
        return input;
    }
    /**
     * This method that set this.input array by input array in field.
     * @param input
     */
    public void setInput(double input) {
        this.input = input;
    }
}
