package com.Finals;

public class CreateBinarie extends  Task{

    public CreateBinarie(int timeSpend, Engineers engineer) {
        super(timeSpend, engineer);
    }

    @Override
    public int taskType() {
        return 3;
    }
}
