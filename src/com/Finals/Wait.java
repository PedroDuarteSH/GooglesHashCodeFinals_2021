package com.Finals;

public class Wait extends  Task{
    public Wait(int timeSpend, Engineers engineer) {
        super(timeSpend, engineer);
    }

    @Override
    public int taskType() {
        return 4;
    }
}
