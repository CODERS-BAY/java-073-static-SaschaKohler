package com.codersbay;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Static");


        Camera camera1 = new Camera("Leica", 16.5, 300,
                200, false, 12, 8);
        Camera camera2 = new Camera("RoboCam", 16.5, 300,
                200, false, 12, 8);
        Camera camera3 = new Camera("Fuji", 16.5, 300,
                200, false, 38, 20);
        Camera camera4 = new Camera("Hasselblaad", 16.5, 300,
                200, false, 9, 2);


        System.out.println(camera1.toString());
        System.out.println(camera2.toString());
        System.out.println(camera3.toString());
        System.out.println(camera4.toString());


        System.out.println("Number of Camera Instances " + camera1.getCounter());
        System.out.println("Number of Lens Instances " + camera2.getLens().getCounter());

    }
}
