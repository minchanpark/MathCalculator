package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This LCMEngine class is class that calculate LCME. and this class is included required method.
 */
public class LCMEngine implements Computable{
    private static final String engineName ="LCM";
    private int[] input;
    private int result;

    /**
     * This method that return input array.
     * @return
     */
    public int[] getInput() {
        return input;
    }
    /**
     * This method that set this.input array by input array in field.
     * @param input
     */
    public void setInput(int[] input) {
        this.input = input;
    }

    /**
     * This is method that calculate LCM.
     */
    public void compute() {
        this.result=this.input[0];
    
        for (int i = 0; i < this.input.length; i++) {
            int num = this.input[i];
            
            int max = Math.max(this.result, num);
            int min = Math.min(this.result, num);
            
                for (int j = 1; j <= min; j++) {
                    int candidate = max * j;
                    if (candidate % min == 0) {
                            setResult(candidate);
                            break;  
                    }
                }
            }
        }

    /**
     * This method that return engineName "LCM".
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * This method that return result.
     */
    public double getResult() {
        return result;
    }
    /**
     * This method that set this.result by result in field.
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * This is method that bring args array from main method to Calculate class.
     */
    public void setInput(String[] args) {
        if(args.length<=2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExitLCM(engineName, 2);
            System.exit(0);
        }
        this.input = new int[args.length - 1];
        for(int i=1; i<args.length; i++){
            if(Integer.parseInt(args[i])<0){
                InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
                System.exit(0);
            }
            this.input[i-1]=Integer.parseInt(args[i]);
        }
    } 
}
