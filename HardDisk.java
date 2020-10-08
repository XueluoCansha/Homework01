package wodepackage;

public class HardDisk {
	HardDisk(){
	}
    public double rate;
    HardDisk(int rate){
    	this.rate = rate;
	}
    private int amount;
    int getAmount(){
        return amount;
    }
    public void setAmount(int m){
        this.amount = m;
    }
}