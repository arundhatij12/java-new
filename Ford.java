package com.company;

class Ford extends Car{
    public Ford(int cylinders, String name) {
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



