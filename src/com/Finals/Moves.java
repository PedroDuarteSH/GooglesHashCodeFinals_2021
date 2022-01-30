package com.Finals;

public class Moves extends Task {
    Service service;
    Binarie fromBin;
    Binarie toBin;


    public Moves(int timeSpend, Engineers engineer, Service service, Binarie fromBin, Binarie toBin) {
        super(timeSpend, engineer);
        this.service = service;
        this.fromBin = fromBin;
        this.toBin = toBin;
    }


    @Override
    public int taskType() {
        return 2;
    }
}
