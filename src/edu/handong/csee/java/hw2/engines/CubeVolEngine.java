package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
import java.lang.Math;

/**
 * This is CubeVolEngine class that calculate Cube volume.
 */
public class CubeVolEngine implements Computable {
    private static final String engineName ="CUBEVOL";
    private double sideLegth;
    private double volume;

    /**
     * This is method that return volume.
     * @return
     */
    public double getVolume() {
        return volume;
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
            setSideLegth(0);
        }
        else{
            setSideLegth(Integer.parseInt(args[1]));
        }
    }
    /**
     * This is method that calculate Cube volume.
     */
    public void compute(){
        setVolume(Math.pow(this.sideLegth, 3));
    }
    /**
     * This method that return engineName "CUBEVOL".
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * This method that return volume.
     */
    public double getResult(){
        return volume;
    }

    /**
     * This method that set this.sideLength by sideLength in field.
     * @param sideLegth
     */
    public void setSideLegth(double sideLegth) {
        this.sideLegth = sideLegth;
    }
    /**
     * This method that return sideLength.
     * @return
     */
    public double getSideLength(){
        return sideLegth;
    }
    /**
     * This method that set this.volume by volume in field.
     * @param volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
