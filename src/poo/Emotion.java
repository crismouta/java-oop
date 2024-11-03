package poo;

import poo.interfaces.DailyRoutine;

public class Emotion extends Character implements DailyRoutine {
    private String color;

    private boolean isPositive;

    private int intensity;

    public Emotion(String name, int age, String color, boolean isPositive, int intensity) {
        super(name, age);
        this.color = color;
        this.isPositive = isPositive;
        this.intensity = intensity;
    }

    @Override
    public void introduce() {
        System.out.println(
                "Hi I'm " + super.getName() + ", I'm " + super.getAge() + " and my color is " + this.color + "."
        );
    }

    @Override
    public void wakeUp() {
        System.out.println(super.getName() + " is up! Ready to start the day as an human");
    }
    @Override
    public void sleep() {
        System.out.println(super.getName() + " is sleeping. See you tomorrow!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setPositive(boolean positive) {
        isPositive = positive;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }


}


