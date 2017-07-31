package com.company;

/**
 * Created by Paulig on 5/10/2017.
 */
public class DetectorAggregator implements Aggregator {

    DetectorSet set;

    DetectorAggregator(DetectorSet set){
        this.set=set;
    }

    @Override
    public DetectorIterator getIterator() {
       return new DetectorIterator(set.getList());
    }
}
