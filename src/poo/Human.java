package poo;

import poo.interfaces.DailyRoutine;
import poo.interfaces.Feeding;

public class Human extends Character implements DailyRoutine, Feeding {
    private String rol;

    public Human(String name, int age, String rol) {
        super(name, age);
        this.rol = rol;
    }
    @Override
    public void introduce() {
        System.out.println(
                "Hi I'm " + super.getName() + ", I'm " + super.getAge() + " and I'm the " + this.rol + "."
        );
    }

    @Override
    public void wakeUp() {
        System.out.println(super.getName() + " is up! Ready to start the day as an human");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + "is eating!");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " is sleeping. See you tomorrow!");
    }
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}
