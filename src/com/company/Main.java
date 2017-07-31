package com.company;


public class Main {

    public static void main(String[] args) {
        DetectorSet set = new DetectorSet();
        DetectorAggregator aggregator = new DetectorAggregator(set);

        set.addDetector(0, new ConcreateTermometer());
        set.addDetector(1, new ConcreateTermometer());
        set.addDetector(1, new ConcreateTermometer());
        set.addDetector(2, new ConcreateTermometer());
        set.addDetector(2, new ConcreteSmokeDetector());

        VIsitorSetter vIsitorSetter = new VIsitorSetter();
        VisitorCounter visitorCounter = new VisitorCounter();
        DetectorIterator iterator = aggregator.getIterator();
        int temper = 30;
        while (iterator.hasNext()) {
            TestableDetector temp = iterator.next();
            if (temp instanceof ConcreateTermometer) {
                ((ConcreateTermometer) temp).acceptVisitor(vIsitorSetter);
                ((ConcreateTermometer) temp).setTemperature(temper++);
                ((ConcreateTermometer) temp).acceptVisitor(visitorCounter);

            } else if (temp instanceof ConcreteSmokeDetector) {
                ((ConcreteSmokeDetector) temp).acceptVisitor(vIsitorSetter);
                ((ConcreteSmokeDetector) temp).setSmokeDetected(true);

            }
        }
        System.out.println("avarege temperature = " + visitorCounter.showAVG());
    }
}
