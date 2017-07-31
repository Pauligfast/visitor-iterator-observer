package com.company;

/**
 * Created by Paulig on 5/10/2017.
 */
public class ConcreteSmokeDetector implements SmokeDetector, TestableDetector, Visitable {

    private boolean smokeDetected = false;
    SmokeObserver smokeObserver;

    public void setSmokeDetected(boolean smokeDetected) {
        this.smokeDetected = smokeDetected;
        hasSmokeBeenDetected();
    }


    @Override
    public boolean hasSmokeBeenDetected() {
        test();
        return this.smokeDetected;
    }

    @Override
    public boolean addSmokeObserver(SmokeObserver o) {
        if (o != null) {
            this.smokeObserver = o;
            return true;
        }
        return false;
    }

    @Override
    public boolean test() {
        if (smokeDetected) {
            smokeObserver.smokeDetectedNotification();
            return true;
        }
        return false;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
       visitor.operation(this);
    }
}
