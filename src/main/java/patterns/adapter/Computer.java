package patterns.adapter;

public class Computer {

    public void readFromUSB(USB usbDevice) {
        usbDevice.readData();
    }
}

