public class SSD {
    private int memoryCapacity;
    private short HowManyDisksAreDividedInto;

    public SSD(int memoryCapacity, short howManyDisksAreDividedInto) {
        this.memoryCapacity = memoryCapacity;
        HowManyDisksAreDividedInto = howManyDisksAreDividedInto;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public short getHowManyDisksAreDividedInto() {
        return HowManyDisksAreDividedInto;
    }

    public void setHowManyDisksAreDividedInto(short howManyDisksAreDividedInto) {
        HowManyDisksAreDividedInto = howManyDisksAreDividedInto;
    }

    public  String getInfoSSD(){
        return "\nMemory: " + memoryCapacity + " GB " +
                "\nHow many disks are divided into: " + getHowManyDisksAreDividedInto();
    }
}

