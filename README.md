Builder Pattern Example in Java

Overview

This project demonstrates the difference between creating objects **with** and **without** the Builder Pattern in Java.
It uses a `Computer` class as an example, showing how the Builder Pattern simplifies object creation when there are multiple optional attributes.

-----------------------------------------------------------------------------------------------

Part 1: With Builder Pattern (`ComputerWithBuilder.java`)

Description

This version uses the Builder Pattern to construct `Computer` objects step by step.
You can set only the fields you need, and the code remains clean and readable.

Example Code

```java
public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("GPU: " + GPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setGPU("RTX 4080")
            .setRAM(32)
            .setStorage(2000)
            .build();

        gamingPC.showSpecs();
    }
}
```

Sample Output

```
CPU: Intel i9
GPU: RTX 4080
RAM: 32GB
Storage: 2000GB
```

-----------------------------------------------------------------------------------------------

Part 2: Without Builder Pattern (`ComputerNoBuilder.java`)

Description

This version creates the same object without using the Builder Pattern.
It relies on a constructor that takes multiple parameters, which can be confusing and error-prone.

Example Code

```java
public class ComputerNoBuilder {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    public ComputerNoBuilder(String CPU, String GPU, int RAM, int storage) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.storage = storage;
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("GPU: " + GPU);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        ComputerNoBuilder gamingPC = new ComputerNoBuilder("Intel i9", "RTX 4080", 32, 2000);
        gamingPC.showSpecs();
    }
}
```

Sample Output

```
CPU: Intel i9
GPU: RTX 4080
RAM: 32GB
Storage: 2000GB
```

Would you like me to zip both `.java` files and include this `README.md` inside for submission?
