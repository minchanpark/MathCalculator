package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This  MaxEngine class is class that find max number. and this class is included required method.
 */
public class MaxEngine implements Computable {
    private static final String engineName ="MAX";
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
     * This is method that calculate LCM.
     */
    public void compute(){
        double max=this.input[0];
        for(int i=1; i<this.input.length; i++){
            if(this.input[i]>max){
                max=this.input[i];
            }
        }
        setResult(max);
    }

    /**
     * This method that return engineName "MAX".
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
    public double[] getInput() {
        return input;
    }
    /**
     * This method that set this.input array by input array in field.
     * @param input
     */
    public void setInput(double[] input) {
        this.input = input;
    }
}
