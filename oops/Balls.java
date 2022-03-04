package com.samples.oops;

import processing.core.PApplet;
//This class is a object model of ball


public class Balls {

    //Class variables
    int diameter;
    PApplet applet;

    //Constructor to hold the diameter and PApplet objects
    Balls(int tempDia, PApplet applet) {
        this.diameter = tempDia;
        this.applet = applet;
    }

    //Method to draw the balls, this method takes two inputs
    //1- The relative speed at which ball created has to move
    //2. Ball count which will be used to calculate the height from the top
    public void draw(int speed, int ballCount) {
        applet.ellipse(speed, ballCount * (applet.height / 5), diameter, diameter);
    }
}