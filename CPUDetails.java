class CPU{
    double price;
    CPU(double price){
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer){
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void display(){
            System.out.println("Processor information");
            System.out.println("Cores:" + cores);
            System.out.println("Manufacturer:" + manufacturer);
        }
    }
    class RAM {
        int memory;
        String manufacturer;
        RAM(int memory, String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("RAM INformation:");
            System.out.println("Memory:" + memory + "GB");
            System.out.println("Manufacturer:" + manufacturer);
        }
    }
}

public class CPUDetails {
    public static void main(String[] args){

        CPU cpu = new CPU(45000);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = cpu.new RAM(16,"Corsair");

        System.out.println("CPU Price:" + cpu.price);
        processor.display();
        ram.display();
    }
}