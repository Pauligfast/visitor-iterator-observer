package com.company;

/**
 * Created by Paulig on 5/11/2017.
 */
public class VIsitorSetter extends Visitor {
    @Override
    public void operation(ConcreateTermometer detector) {
       detector.addTemperatureObserver(new FireAlarm());
    }

    @Override
    public void operation(ConcreteSmokeDetector detector) {
       detector.addSmokeObserver(new FireAlarm());
    }
}
