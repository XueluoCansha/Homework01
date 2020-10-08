package wodepackage;

public class CPU {
    CPU(){
	}
    public double utility;
    CPU(double utility){
    	this.utility = utility;
	}
    private int speed;
    int getSpeed(){
        return speed;
    }
    public void setSpeed(int m){
        this.speed = m;
    }
}