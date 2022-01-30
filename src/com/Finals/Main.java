package com.Finals;


/*
Input:
    Number of services
    NUmber of binaries
    Set of feutures


Output:
    Shedule Engineering work
 */


import java.io.*;
import java.util.*;

/*

 */
public class Main {
    private ArrayList<Binarie> binaries;
    private ArrayList<Engineers> engineers;
    private ArrayList<Service> services;
    private ArrayList<Feature> features;
    private final String FILENAMES;
    private int days;
    private int daysCreateBinarie;

    public static void main(String[] args) {
	// write your code here
        Main mainProg = new Main("InputFiles\\an_example.txt");
        mainProg.readFiles();

        mainProg.start();
    }

    public Main(String filenames){
        FILENAMES = filenames;
        binaries = new ArrayList<>();
        engineers = new ArrayList<>();
        services = new ArrayList<>();
        features = new ArrayList<>();
    }

    private void readFiles() {
        System.out.println("Reading Files");
        File f = new File(FILENAMES);
        int engineers;
        int services;
        int binaries;
        int features;


        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String[] split_line = line.split(" ");
            days = Integer.parseInt(split_line[0]);
            engineers = Integer.parseInt(split_line[1]);
            services = Integer.parseInt(split_line[2]);
            binaries = Integer.parseInt(split_line[3]);
            features = Integer.parseInt(split_line[4]);
            daysCreateBinarie = Integer.parseInt(split_line[5]);

            //Create initial binaries
            for (int i = 0; i < binaries; i++) {
                this.binaries.add(new Binarie(i));
            }

            //Create services and add to respective binaries
            for (int i = 0; i < services; i++) {
                line = br.readLine();
                split_line = line.split(" ");
                int binariesNumber = Integer.parseInt(split_line[1]);
                Binarie toAdd = this.binaries.get(binariesNumber);
                Service thisService = new Service(split_line[0], toAdd);
                toAdd.addService(thisService);
                this.services.add(thisService);
            }

            for (int i = 0; i < features; i++) {
                line = br.readLine();
                split_line = line.split(" ");
                Feature newFeature = new Feature(split_line[0],
                        Integer.parseInt(split_line[2]),
                        Integer.parseInt(split_line[3]));
                line = br.readLine();
                split_line = line.split(" ");
                for (String s : split_line) {
                    for (Service ser : this.services) {
                        if (ser.getName().equals(s)) {
                            newFeature.addService(ser);

                            break;
                        }
                    }
                }
                this.features.add(newFeature);

            }
            for (int i = 0; i < engineers; i++) {
                this.engineers.add(new Engineers(i));
            }

            System.out.println("Files read and data created");
        }
        catch (FileNotFoundException exception){
            System.out.println("An error occurred reading " + FILENAMES + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void start(){
        System.out.println("Starting ");
        //Calculate all possibilities and give a time punctuation to each one of them
        //First organize by Priority features
        //Priority features are the ones that takes less time and influences most of people
        Collections.sort(features);

        System.out.println(features);

        int daysCount = 1;
        while (true){
            int toGet = 0;
            Feature prioritary = features.get(toGet);
            //Calculate what each engineer can do
            for (Engineers e: engineers) {
                int maxPontuation;
                int tTImplem =  timeToImplement(prioritary);
                System.out.println(tTImplem);
            }


            if(features.size() == 0){
                break;
            }

            daysCount++;
            break;
        }

    }


    private HashMap<Binarie, Integer> serviceInBinaryCount(Feature feature){
        HashMap<Binarie, Integer> best = new HashMap<>();
        for (Service s:feature.getServices()) {
            if(s.getWorkedOn() == 0){
                if(best.containsKey(s.getBinarie())) {
                    best.replace(s.getBinarie(), best.get(s.getBinarie()) + 1);
                }
                else{
                    best.put(s.getBinarie(), 1);
                }
            }
        }

        return best;
    }


    private int timeToImplement(Feature feature){
        //Time to implement that
        HashMap<Binarie, Integer> best =  serviceInBinaryCount(feature);
        Binarie toWork = null;
        int binarieCount = 0;
        for (Binarie b : best.keySet() ) {
            if(best.get(b) > binarieCount){
                toWork = b;
            }
        }

        //People Working on binarie

        assert toWork != null;
        return feature.getDifficulty() + toWork.getServices().size();
    }

    private int workingOn(Feature feature){
        //Time to implement that
        HashMap<Binarie, Integer> best =  serviceInBinaryCount(feature);
        Binarie toWork = null;
        int binarieCount = 0;
        for (Binarie b : best.keySet() ) {
            if(best.get(b) > binarieCount){
                toWork = b;
            }
        }

        //People Working on binarie

        assert toWork != null;
        return feature.getDifficulty() + toWork.getServices().size();
    }

}



