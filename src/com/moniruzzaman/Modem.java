package com.moniruzzaman;

import java.util.List;

public class Modem {

    public static String sendUSSD(String command, String portName) {
        ModemUtils modemUtils = new ModemUtils();

        return modemUtils.ussdDial(command, portName);

    }

    public static List<String> getActiveModemsPorts() {
        ModemUtils modemUtils = new ModemUtils();
        return modemUtils.getActivePorts();
    }

    public static String disconnect() {
        ModemUtils modemUtils = new ModemUtils();
        return modemUtils.disconnect();
    }
    
}
