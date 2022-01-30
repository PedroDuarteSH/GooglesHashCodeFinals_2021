package com.Finals;

import java.util.ArrayList;

public class Binarie {
    private ArrayList<Service> services = new ArrayList<>();
    private int number;

    public Binarie(int number) {
        this.number = number;
    }

    public void addService(Service service){
        services.add(service);
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Binarie{" +
                
                ", number=" + number +
                '}';
    }



}
