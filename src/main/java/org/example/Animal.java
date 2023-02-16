package org.example;

public class Animal {

    private String name;
    String gender;
    private double weight=1;
    Animal partner;

    public Animal() {

    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void findPartner(Animal partner){
        this.partner = partner;
    }

}
