package com.Finals;

public class Implements extends Task {
    Feature feature;
    Binarie binarie;

    public Implements(int timeSpend, Engineers engineer, Feature feature, Binarie binarie) {
        super(timeSpend, engineer);
        this.feature = feature;
        this.binarie = binarie;
    }

    @Override
    public int taskType() {
        return 1;
    }
}

