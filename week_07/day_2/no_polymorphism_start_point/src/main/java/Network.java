import java.util.*;

public class Network {
    private String name;
    private Integer maxConnections;
//    private ArrayList<Desktop> devicesDesktop;
//    private ArrayList<Printer> devicesPrinter;
    private ArrayList<IConnect> devices;

    public Network(String name, Integer maxConnections){
        this.devices = new ArrayList<IConnect>();
//        this.devicesDesktop = new ArrayList<Desktop>();
//        this.devicesPrinter = new ArrayList<Printer>();
        this.name = name;
        this.maxConnections = maxConnections;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
//        return devicesDesktop.size() + devicesPrinter.size();
        return devices.size();
    }

//    public void connect(Desktop desktop){
//        devicesDesktop.add(desktop);
//    }

//    public void connect(Printer printer){
//        devicesPrinter.add(printer);
//    }

    public void connect(IConnect device){
        if (emptySlotCount() > 0) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
//        devicesDesktop.clear();
//        devicesPrinter.clear();
        devices.clear();
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public int emptySlotCount() {
        return (getMaxConnections() - deviceCount());
    }
}