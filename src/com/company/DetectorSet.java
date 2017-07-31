package com.company;

import java.util.LinkedList;

/**
 * Created by Paulig on 5/10/2017.
 */
public class DetectorSet {
    private LinkedList<LinkedList<TestableDetector>> detectors = new LinkedList<>();
    int numofRooms = 0;

   DetectorSet(){
       detectors.add(new LinkedList<>());
   }

    public void addDetector(int roomID, TestableDetector detector) {
        if (roomID <= numofRooms) detectors.get(roomID).add(detector);
        else {
            detectors.add(new LinkedList<>());
            numofRooms++;
            detectors.get(numofRooms).add(detector);
        }
    }

    public LinkedList<LinkedList<TestableDetector>> getList() {
        return detectors;
    }


}
