package com.company;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by Paulig on 5/10/2017.
 */
public class DetectorIterator implements Iterator {

    private LinkedList<LinkedList<TestableDetector>> detectors = new LinkedList<>();

    DetectorIterator(LinkedList<LinkedList<TestableDetector>> detectors) {
        this.detectors = detectors;
        currentRoom = detectors.getFirst();
        currentNode = currentRoom.getFirst();
        roomIndex = -1;
        nodeIndex = -1;
    }

    private int roomIndex;
    private int nodeIndex;
    TestableDetector currentNode;
    LinkedList<TestableDetector> currentRoom;

    public boolean hasNext() {
        return !((currentRoom == detectors.getLast()) && (currentNode == currentRoom.getLast()));
    }

    @Override
    public TestableDetector next() throws NoSuchElementException {
            if (currentNode != currentRoom.getLast()) {
            currentNode = currentRoom.get(++nodeIndex);
            return currentNode;
        } else if (currentNode == currentRoom.getLast() && currentRoom != detectors.getLast()) {
            currentRoom = detectors.get(++roomIndex);
            nodeIndex = 0;
            currentNode = currentRoom.getFirst();
            return currentNode;
        } else throw new NoSuchElementException();
    }
}
