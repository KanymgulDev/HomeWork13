public class VideoCard {
    private String model;
    private int memory;

    public VideoCard(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getInfoViCard() {
        return "\nModel: " + model +
                "\nMemory: " + memory + " GB";
    }
}
