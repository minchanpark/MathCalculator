package edu.handong.csee.java.hw2.engines;

/**
 * This interface is included for required method to every class.
 */
public interface Computable {
    /**
     * This is method wrapper that bring args array from main method in Calculator class
     * @param args
     */
    public void setInput(String[] args);
    /**
     * This is method wrapper that calculate for calculate class to claculate by each way.
     */
    public void compute();
    /**
     * This is method wrapper that return result.
     * @return
     */
    public double getResult();
}
