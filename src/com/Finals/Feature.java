package com.Finals;

import java.util.ArrayList;

public class Feature implements Comparable<Feature>{

    private final String name;
    private final int difficulty;
    private final int usersBenefit;

    private final ArrayList<Service> servicesToImplement = new ArrayList<>();

    public Feature(String name, int difficulty, int usersBenefit) {
        this.name = name;
        this.difficulty = difficulty;
        this.usersBenefit = usersBenefit;

    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getUsersBenefit() {
        return usersBenefit;
    }

    public void addService(Service service){
        servicesToImplement.add(service);
    }

    public void removeService(Service service){
        servicesToImplement.remove(service);
    }

    public boolean is_implemented(){
        return 0 == servicesToImplement.size();
    }

    public ArrayList<Service> getServices(){
        return servicesToImplement;
    }

    @Override
    public int compareTo(Feature other) {
        if(this.usersBenefit > other.usersBenefit){
            return -1;
        }
        else if(this.usersBenefit < other.usersBenefit)
            return 1;
        else{
            return -Integer.compare(other.difficulty, this.difficulty);
        }
    }

    @Override
    public String toString() {
        return "Feature{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", usersBenefit=" + usersBenefit +
                ", servicesImplem=" + servicesToImplement +
                '}';
    }
}
