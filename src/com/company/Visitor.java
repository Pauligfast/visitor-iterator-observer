package com.company;

/**
 * Created by Paulig on 5/11/2017.
 */
abstract class Visitor {

    private TestableDetector visited;

    public TestableDetector getVisited() {
        return visited;
    }

    public void setVisited(TestableDetector visited) {
        this.visited = visited;
    }

    abstract void operation(ConcreateTermometer detector);

    abstract void operation(ConcreteSmokeDetector detector);
}
