package car;

import behaviours.IDrive;

public abstract class Car implements IDrive {

    private int cost, speed, damage;

    public Car(int cost, int speed){
        this.cost = cost;
        this.speed = speed;
        this.damage = 0;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }

    public String drive(){
        return "You are travelling at: " + getSpeed() + "mph";
    }
}
