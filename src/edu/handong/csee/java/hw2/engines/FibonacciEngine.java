package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;

/**
 * This FibonacciEngine class is class that calculate fibonacci. and this class is included required method.
 */
public class FibonacciEngine implements Computable {
    private static final String engineName ="FIBONACCI";
    private int n;
    private double result;

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
     * This method that set this.result by result in field.
     * @param result
     */
    public void setResult(double result){
        this.result=result;
    }
    /**
     * This is method that calculate fibonacci.
     */
    public void compute(){
        setResult(getN()+(getN()-1));
    }
    /**
     * This method that return engineName "FIBONACCI".
     * @return
     */
    public String getengineName(){
        return engineName;
    }
    /**
     *  This method that return n.
     *  @return
     */
    public int getN(){
        return n;
    }
    /**
     * This method that set this.n by n in field.
     * @param n
     */
    public void setN(int n){
        this.n=n;
    }
    /**
     * This method that return result.
     */
    public double getResult(){
        return result;
    }
}
