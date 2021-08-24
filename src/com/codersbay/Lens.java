package com.codersbay;

public class Lens {
    private int focalLengthMax;
    private int focalLengthMin;
    private static int counter=0;

    public Lens(int flMax,int flMin) {
        if(flMax > flMin) {
            this.focalLengthMax = flMax;
            this.focalLengthMin = flMin;
            counter++;
            return;
        }
        System.out.println("FocalLength max must be greater than min");
    }

    public int getCounter() {
        return counter;
    }

    public int getFocalLengthMax() {
        return focalLengthMax;
    }

    public void setFocalLengthMax(int focalLengthMax) {
        this.focalLengthMax = focalLengthMax;
    }

    public int getFocalLengthMin() {
        return focalLengthMin;
    }

    public void setFocalLengthMin(int focalLengthMin) {
        this.focalLengthMin = focalLengthMin;
    }
}
