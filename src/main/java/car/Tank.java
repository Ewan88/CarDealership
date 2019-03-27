package car;

import behaviours.IDrive;

public class Tank implements IDrive {

    private int price, speed;

    public Tank(int price, int speed){
        this.price = price;
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public String drive() {
        return "You are travelling at: " + getSpeed() + "mph";
    }
}
