public class Laptop {
    private String model;
    private String color;

    private String ssd;
    private String ram;
    private String display;
    private String videoCard;
    private String usbs;
    private String keyboard;

    public Laptop(String model, String color, String ssd, String ram, String display, String videoCard, String usbs, String keyboard) {
        this.model = model;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.display = display;
        this.videoCard = videoCard;
        this.usbs = usbs;
        this.keyboard = keyboard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getUsbs() {
        return usbs;
    }

    public void setUsbs(String usbs) {
        this.usbs = usbs;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop " +
                "\nModel: " + model +
                "\nColor: " + color +
                "\n\nSSD: " + ssd +
                "\n\nRAM: " + ram +
                "\n\nDisplay: " + display +
                "\n\nVideo card: " + videoCard +
                "\n\nUSB: " + usbs +
                "\n\nKeyboard: " + keyboard ;
    }
}