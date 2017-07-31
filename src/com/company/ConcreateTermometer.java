package com.company;

/**
 * Created by Paulig on 5/10/2017.
 */
public class ConcreateTermometer implements Termometer, TestableDetector, Visitable {

    private TemperatureObserver temperatureObserver;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        test();
    }

    private int temperature;

    @Override
    public void addTemperatureObserver(TemperatureObserver o) {
        if (o != null) {
            this.temperatureObserver = o;
        }
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public boolean test() {
        temperatureObserver.temperatureChangedNotification();
        System.out.println(temperature);
        return false;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.operation(this);
    }
}
