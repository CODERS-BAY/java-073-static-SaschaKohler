package com.codersbay;

public class Camera {

    private String brand;
    private double megaPixels;
    private int displaySizeX;
    private int displaySizeY;
    private boolean bw;

    private Lens lens;

    private static int counter=0;

    public Camera(String brand, double megaPixels, int displaySizeX, int displaySizeY,
                  boolean bw, int flMax, int flMin) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySizeX = displaySizeX;
        this.displaySizeY = displaySizeY;
        this.bw = bw;
        this.lens = new Lens(flMax, flMin);
        counter++;
    }

    public  int getCounter() {
        return counter;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySizeX() {
        return displaySizeX;
    }

    public void setDisplaySizeX(int displaySize) {
        this.displaySizeX = displaySize;
    }

    public int getDisplaySizeY() {
        return displaySizeY;
    }

    public void setDisplaySizeY(int displaySize) {
        this.displaySizeY = displaySize;
    }

    public boolean isBw() {
        return bw;
    }

    public void setBw(boolean bw) {
        this.bw = bw;
    }

    public Lens getLens() {
        return lens;
    }

    public int getLensFlMax() {
        return lens.getFocalLengthMax();
    }

    public int getLensFlMin() {
        return lens.getFocalLengthMin();
    }




    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySizeX=" + displaySizeX +
                ", displaySizeY=" + displaySizeY +
                ", bw=" + bw +
                ", lens.flMax=" + lens.getFocalLengthMax() +
                ", lens.flMin=" + lens.getFocalLengthMin() +
                '}';
    }

}
