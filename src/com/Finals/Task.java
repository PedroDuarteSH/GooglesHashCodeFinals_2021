package com.Finals;

public class Task {
    int timeSpend;
    Engineers engineer;

    public Task(int timeSpend, Engineers engineer) {
        this.timeSpend = timeSpend;
        this.engineer = engineer;
    }

    /*
    Return types of Tasks
    Implements - 1
    Moves - 2
    CreateBinarie - 3
    Wait - 4
     */
    public int taskType(){
        return 0;
    }
}

