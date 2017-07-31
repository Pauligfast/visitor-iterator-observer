package com.company;

/**
 * Created by Paulig on 5/8/2017.
 */
public interface SmokeDetector {
    boolean hasSmokeBeenDetected();
    boolean addSmokeObserver(SmokeObserver o);
}
