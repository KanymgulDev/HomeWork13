public class Main {
    public static void main(String[] args) {
        Display display = new Display(15.6, "Acer", "LCD");
        SSD ssd = new SSD(512, (short) 1);
        RAM ram = new RAM(8.0d, "Micron");
        VideoCard videoCard = new VideoCard("GeForce GTX 1650", 4);
        USB usb = new USB(3.1, 92631);
        Keyboard keyboard = new Keyboard();
        keyboard.setIllumination(true);
        keyboard.setAdditionalKeys(true);


        Laptop laptop = new Laptop("Acer nitro 5", "Black with shades of red", ssd.getInfoSSD(), ram.getInfoRAM(), display.getInfoDis(),
                videoCard.getInfoViCard(), usb.getInfoUSB(), keyboard.getInfoKey());
        System.out.println(laptop.toString());





    }
}