package wodepackage;

public class PC {
	PC(){
	}
    public double ram;
    PC(double ram){
    	this.ram = ram;
	}
	CPU cpu;
    HardDisk HD;
    void setCPU(CPU c){
        this.cpu = c;
    }
    void setHardDisk(HardDisk h){
        this.HD = h;
    }
    void show(){
        System.out.println("CPU的速度："+cpu.getSpeed());
        System.out.println("CPU的利用率："+cpu.utility+"%");
        System.out.println("硬盘的容量："+HD.getAmount());
        System.out.println("硬盘的读写速度："+HD.rate+"M/s");
        System.out.println("PC的内存："+ram+"G");
    }
}