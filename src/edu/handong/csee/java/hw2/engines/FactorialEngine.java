package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This FactorialEngine class is class that calculate factorial. and this class is included required method.
 */
public class FactorialEngine implements Computable {
    private static final String engineName ="FACTORIAL";
    private int n;
    private double result; 

    /**
     * This is method that calculate factorial.
     */
    public void compute(){
        int temp=1;
        for(int i=1; i<=getN(); i++){
            temp=temp*i;
        }
        setResult(temp);
    }

    /**
     * This is method that bring args array from main method to Calculate class.
     */
    public void setInput(String[] args){
        if(args.length>2){
            InputChecker.printErrorMesssageForTheNumberOfRequiredInputsAndExit(engineName, 1);
            System.exit(0);
        }
        else if(Integer.parseInt(args[1])<0){
            InputChecker.printErrorMesssageForNegativeInputsAndExit(engineName);
            System.exit(0);
        }
        else if(Integer.parseInt(args[1])==0){
            setN(n);
        }
        else{
            setN(Integer.parseInt(args[1]));
        }
    }

    /**
     * This method that return engineName "CUBEVOL".
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }

    /**
     * This method that return n.
     */
    public int getN() {
        return n;
    }

    /**
     * This method that return result.
     */
    public double getResult() {
        return result;
    }

   /**
    * This method that set this.n by n in field.
    * @param n
    */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * This method that set this.result by result in field.
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }
}
