package com.company;

import java.util.Scanner;


class Car{
private boolean engine;
private int cylinders;
private String name;
private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name=name;
        this.wheels=4;
        this.engine=true;
    }

    public String startEngine(){
        return "Car->startEngine";
    }

    public String accelerate(){
        return "Car->accelerate";
    }

    public String brake(){
        return "Car->brake";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi->accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi->brake";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi->startEngine";
    }
}



public class Main {

    public static void main(String[] args) {


   private static void Scanner scanner=new Scanner(System.in);

    int[] myIntegers= getIntegers(5);
    }



public static int[] getIntegers(int capacity){
    int[] array=new int[capacity];
    System.out.println("enter"+capacity+" integer valuse:\r");
    for(int i=0; i<array.length; i++){
        array[i]=scanner.nextInt();
    }
    return array;
}

public static void printArray(int[]array){
    for(int i=0;i<array.length; i++){
        System.out.println("element"+"contents"+array[i]);
    }
    }


public static int[] sortIntegers(int[] array){
    int[] sortedArray=new int[array.length];
    for(int i=0; i<array.length; i++){
        sortedArray[i]=array[i];
    }
    boolean flag=true;
    int temp;
    while(flag){
        flag=false;
        for(int i=0; i<sortedArray.length-1; i++){
            if(sortedArray[i]<sortedArray[i+1]){
                temp=sortedArray[i];
                sortedArray[i]=sortedArray[i+1];
                sortedArray[i+1]=temp;
                flag=true;
            }
        }
    }

    return sortedArray;
}

}

    

