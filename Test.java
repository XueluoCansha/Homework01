package wodepackage;

public class Test {
	Test(){
	}
	public static void main(String args[]){
        CPU cpu = new CPU(3);
        cpu.setSpeed(2200);
        HardDisk disk = new HardDisk(40);
        disk.setAmount(200);
        PC pc = new PC(16);
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}