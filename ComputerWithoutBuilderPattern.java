class Computer{
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    public Computer(String CPU, String RAM, String storage, String GPU) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GPU = GPU;
    }

    public void displaySpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + GPU);
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("Intel i7", "16GB", "512GB SSD", "NVIDIA GTX 1660");

        myComputer.displaySpecs();
    }
}