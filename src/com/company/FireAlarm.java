package com.company;

/**
 * Created by Paulig on 5/10/2017.
 */
public class FireAlarm implements SmokeObserver, TemperatureObserver {
    @Override
    public void smokeDetectedNotification() {
        System.out.println("Smoke detected!");
    }

    @Override
    public void temperatureChangedNotification() {
        System.out.print("Temperature changed :");
    }
}
