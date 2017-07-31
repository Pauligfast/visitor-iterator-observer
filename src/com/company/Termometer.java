package com.company;

/**
 * Created by Paulig on 5/8/2017.
 */
public interface Termometer  {
    void addTemperatureObserver(TemperatureObserver o);

    float getTemperature();


}
