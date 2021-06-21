package com.company;

abstract class logistic{
    String name;

    public String toString(){
        return "type of transport: " + name;
    }}

abstract class CreaterLogistic{
    public abstract logistic CreaterLogistic();

}

class SeaCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Seadeliver();
    }}

class Seadeliver extends logistic{
    public Seadeliver(){
        name = "Sea deliver transport.";
    }}

class RoadCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Roaddeliver();
    }}

class Roaddeliver extends logistic{
    public Roaddeliver(){
        name = "Road deliver transport.";
    }}

class AirCreater extends CreaterLogistic{
    public logistic CreaterLogistic(){
        return new Airdeliver();
    }}

class Airdeliver extends logistic{
    public Airdeliver(){
        name = "Air deliver transport.";
    }}


class Main{
    public static void main(String[] args) {
        CreaterLogistic mySeaCreater = new SeaCreater();
        CreaterLogistic myRoadCreater = new RoadCreater();
        CreaterLogistic myAirCreater = new AirCreater();

        logistic mySea = mySeaCreater.CreaterLogistic();
        logistic myRoad = myRoadCreater.CreaterLogistic();
        logistic myAir = myAirCreater.CreaterLogistic();

        System.out.println(mySea);
        System.out.println(myRoad);
        System.out.println(myAir);

    }}