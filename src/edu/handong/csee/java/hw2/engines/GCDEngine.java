package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This GCDEngine class is class that calculate GCD. and this class is included required method.
 */
public class GCDEngine implements Computable {
    private static final String engineName ="GCD";
    private int[] input;
    private int result;

    /**
     * This is method that calculate GCD.
     */
    public void compute(){
        if(this.input.length==2){
            int min=this.input[0];
            for(int i=1; i<this.input.length; i++){
                if(this.input[i]<min){
                    min=this.input[i];
                }
            }
            if(this.input[0]<this.input[1]&&input[1]%input[0]==0){
                setResult(this.input[1]);
            }
            else if(this.input[0]>this.input[1]&&input[0]%input[1]==0){
                setResult(this.input[1]);
            }

            if(this.input[0]<this.input[1]&&input[1]%input[0]!=0){
                for(int j=2; j<min; j++){
                    if(min%j==0){
                        setResult(j);
                        return;
                    }
                }
                setResult(1);
            }
            else if(this.input[0]>this.input[1]&&input[1]%input[0]!=0){
                for(int j=2; j<min; j++){
                    if(min%j==0){
                        setResult(j);
                        return;
                    }
                }
                setResult(1);
            }
        }

        if(this.input.length>2){
            int min=this.input[0];
            for(int i=1; i<this.input.length; i++){
                if(this.input[i]<min){
                    min=this.input[i];
                }
            }
            if(this.input[0]%min==0&&this.input[1]%min==0&&this.input[2]%min==0){
                setResult(min);
            }
            else if(this.input[0]%min!=0||this.input[1]%min!=0||this.input[2]%min!=0){
                for(int j=2; j<min; j++){
                    if(min%j==0){
                        setResult(j);
                        return;
                    }
                }
                setResult(1);
            }
        }
    }

    /**
     * This method that return engineName "GCD".
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
}
