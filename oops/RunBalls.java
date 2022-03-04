package com.samples.oops;

import processing.core.PApplet;
import com.samples.oops.Balls;

//This class can create the Balls object and run it
public class RunBalls extends PApplet {

    public final static int DIAMETER = 30;
    Balls balls = null;
    int relativeSpeed = 0;
    int ballCount = 0;
    int speed = 0;


    public static void main(String[] args) {
        PApplet.main("com.samples.oops.RunBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
        balls = new Balls(DIAMETER, this);
    }

    @Override
    public void draw() {
        //Create 4 balls object and calculate their relative speed with first ball
        for (ballCount = 1; ballCount <= 4; ballCount++) {
            relativeSpeed = speed;
            if (ballCount != 1) {
                // Relative speed of 2nd 3rd and 4th ball is calculated here
                relativeSpeed = speed * ballCount;
            }
            balls.draw(relativeSpeed, ballCount);
        }
        //Speed of the first ball is calculated here
        speed = speed + 1;
    }

}



