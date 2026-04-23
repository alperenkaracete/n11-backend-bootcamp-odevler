package odev1.abstracts;

import odev1.interfaces.DosageStrategy;
import odev1.interfaces.FeedStrategy;

public abstract class Animal {

    protected String name;
    protected double weight;
    protected int age;
    protected DosageStrategy dosageStrategy;
    protected FeedStrategy feedStrategy;

    public Animal(String name,double weight,int age,DosageStrategy dosageStrategy, FeedStrategy feedStrategy){

        this.name = name;
        this.weight = weight;
        this.age = age;
        this.feedStrategy = feedStrategy;
        this.dosageStrategy = dosageStrategy;
    }

    public void getDosage(){
        double amount = dosageStrategy.calculateDosage(weight);
        System.out.println("Dosage for " + name + " equal to : " + amount + " unit.");
    }

    public void getFeedSchedule(){
        System.out.println("Feed schedule for " + name + ": " + feedStrategy.getSchedule());
    }
}
