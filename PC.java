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
        System.out.println("CPU���ٶȣ�"+cpu.getSpeed());
        System.out.println("CPU�������ʣ�"+cpu.utility+"%");
        System.out.println("Ӳ�̵�������"+HD.getAmount());
        System.out.println("Ӳ�̵Ķ�д�ٶȣ�"+HD.rate+"M/s");
        System.out.println("PC���ڴ棺"+ram+"G");
    }
}