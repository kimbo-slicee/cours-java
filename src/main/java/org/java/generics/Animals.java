package org.java.generics;

public class Animals {
    protected String animalName;
    protected int animalPaths;
    public Animals(){
        animalName=null;
        animalPaths=0;
    }

    public Animals(String animalName,int animalPaths) {
        this.animalName = animalName;
        this.animalPaths=animalPaths;
    }
    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }
    public void setAnimalPaths(int animalPaths){
        this.animalPaths=animalPaths;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalPaths() {
        return animalPaths;
    }
}
