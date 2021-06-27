package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class Beer {
    private String location;
    private int year;

    public Beer(String location, int year) {
        this.location = location;
        this.year = year;
    }
    public Beer(){

    }

    public String getlocation() {
        return location;
    }

    public void setBand(String band) {
        this.location = location;
    }

    public double getyear() {
        return year;
    }

    public void setyear(double size) {
        this.year= year;
    }

    @Override
    public String toString() {
        return "Beer{" +
                " location='" +  location + '\'' +
                ", year=" + year +
                '}';
    }

    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            Beer a=new Beer("America",1990);
            brands.add(a);
        }  else if (color.equals("light")){
            Beer a=new Beer("English",1991);
            brands.add(a);
        }else if (color.equals("brown")){
            Beer a=new Beer("China",1992);
            brands.add(a);
        }else if (color.equals("dark")){
            Beer a=new Beer("Russia",1993);
            brands.add(a);
        }
        return brands;
    }
}

