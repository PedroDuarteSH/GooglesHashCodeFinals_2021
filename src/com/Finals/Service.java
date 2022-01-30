package com.Finals;

public class Service {
    private String name;
    private Binarie binarie;
    private int workedOn;
    public Service(String name, Binarie binarie) {
        this.name = name;
        this.binarie = binarie;
        workedOn = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Binarie getBinarie() {
        return binarie;
    }

    public void setBinarie(Binarie binarie) {
        this.binarie = binarie;
    }

    public int getWorkedOn() {
        return workedOn;
    }

    public void work() {
        this.workedOn = 1;
    }

    public void stopWork() {
        this.workedOn = 0;
    }
    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", binarie=" + binarie +
                '}';
    }
}
