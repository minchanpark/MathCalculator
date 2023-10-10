package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
import java.lang.Math;

/**
 * This SphereVolEngine class is class that calculate volume of sphere. and this class is included required method.
 */
public class SphereVolEngine implements Computable {
    private static final String engineName ="SPHEREVOL";
    private double radius;
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
            setRadius(0);
        }
        else{
            setRadius(Double.parseDouble(args[1]));
        }
    }
    /**
     * This method that return engineName "SPHEREVOL".
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * This method that return radius.
     * @return
     */
    public double getRadius(){
        return radius;
    }    
    /**
     * This method that return result.
     */
    public double getResult(){
        return result;
    }
    /**
     * This method that set this.radius by radius in field.
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * This method that set this.result by result in field.
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
    * This is method that calculate volume of sphere.
    */
    public void compute(){
        double temp=(4.0/3.0)*Math.PI*Math.pow(this.radius, 3);
        setResult(temp);
    }
}
