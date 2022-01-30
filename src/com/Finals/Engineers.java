package com.Finals;

import java.util.ArrayList;

public class Engineers {
    private int groupNumber;
    private int currentJobTime;
    private ArrayList<Task> tasks;
    public Engineers(int groupNumber) {
        this.groupNumber = groupNumber;
        tasks = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void addTask(Task task){
        tasks.add(task);
    }
}
