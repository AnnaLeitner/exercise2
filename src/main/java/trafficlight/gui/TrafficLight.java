package trafficlight.gui;


import trafficlight.observer.Observer;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update() {
        this.turnOn(!isOn);//wenn isOn true => isOn false sein
    }

    //TODO implement a part of the pattern here
}
