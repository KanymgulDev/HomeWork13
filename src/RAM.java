public class RAM {
    private double volume;
    private String manufacturer;

    public RAM(double volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getInfoRAM() {
        return "\nMemory: " + volume + " GB" +
                "\nManufacturer: " + manufacturer;
    }
}