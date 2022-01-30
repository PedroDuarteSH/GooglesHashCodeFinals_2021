package com.Finals;

public class Service {
    private String name;
    private Binarie binarie;
    public Service(String name, Binarie binarie) {
        this.name = name;
        this.binarie = binarie;
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

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", binarie=" + binarie +
                '}';
    }
}
