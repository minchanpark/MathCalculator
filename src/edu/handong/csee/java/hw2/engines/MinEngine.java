package edu.handong.csee.java.hw2.engines;

import java.util.Arrays;
import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This MinEngine class is class that find min number. and this class is included required method.
 */
public class MinEngine implements Computable {
    private static final String engineName ="MIN";
    private double[] input;
    private double result;

     /**
     * This is method that bring args array from main method to Calculate class.
     */
    public void setInput(String[] args){
        if(args.length<=2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExitLCM(engineName, 2);
            System.exit(0);
        }
        this.input = new double[args.length - 1];
        for(int i=1; i<args.length; i++){
            this.input[i-1]=Integer.parseInt(args[i]);
        }
    }
    /**
    * This is method that find min number.
    */
    public void compute(){
        Arrays.sort(input);
        setResult(input[0]);
        /*double min=this.input[0];
        for(int i=1; i<this.input.length; i++){
            if(this.input[i]<min){
                min=this.input[i];
            }
        }
        this.result=min;*/
    }
    /**
     * This method that return engineName "MIN".
     * @return
     */
    public static String getEnginename() {
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
     * This method that return input array.
     * @return
     */
    public double getInput(){
        return input[0];
    } 
    /**
     * This method that set this.input array by input array in field.
     * @param input
     */
    public void setInput(double[] input) {
        this.input = input;
    }
}
