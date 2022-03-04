package com.samples.procedural;

import processing.core.PApplet;

public class ProcessingFourBalls extends PApplet {

    final static int DIAMETER = 30;
    int speed = 0;
    int ballCount = 0;
    int calculatedSpeed = 0;

    public static void main(String[] args) {
        PApplet.main("com.samples.procedural.ProcessingFourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(500, 500);
    }

    @Override
    public void draw() {
     for (ballCount = 1; ballCount <= 4; ballCount++) {
            calculatedSpeed = speed;
            if (ballCount != 1) {
                calculatedSpeed = speed * ballCount;
            }
            drawballs(calculatedSpeed, ballCount);
        }
        speed = speed + 1;
     }

    public void drawballs(int speed, int ballcount) {
        ellipse(speed, ballcount * (height / 5), DIAMETER, DIAMETER);
    }


}
