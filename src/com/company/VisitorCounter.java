package com.company;

import java.util.LinkedList;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * Created by Paulig on 5/11/2017.
 */
public class VisitorCounter extends Visitor {

    private int numofVisited;
    LinkedList<Float> temperatures = new LinkedList<>();

    public double showAVG(){
        OptionalDouble avg = temperatures.stream().mapToDouble(a->a).average();
        return avg.getAsDouble();
    }

    @Override
    public void operation(ConcreateTermometer detector) {
       temperatures.add(detector.getTemperature());
    }

    @Override
    public void operation(ConcreteSmokeDetector detector) {
        System.out.println("I don't care about the smoke, i'm here to count some temperatures...");
    }
}
