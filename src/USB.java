public class USB {
    private double portType;
    private int idPort;

    public USB(double portType, int idPort) {
        this.portType = portType;
        this.idPort = idPort;
    }

    public double getPortType() {
        return portType;
    }

    public void setPortType(double portType) {
        this.portType = portType;
    }

    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }

    public String getInfoUSB() {
        return "\nPort type: USB " + portType +
                "\nID port: " + idPort;
    }
}

