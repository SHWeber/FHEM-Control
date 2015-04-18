package com.JonasWeb.FhemControl;

import com.JonasWeb.FhemControl.Connection.HTTP;
import com.JonasWeb.FhemControl.Devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final String CfgDir = "/home/Jonas/Dokumente/Devices.cfg";



    public static void main(String[] args) {

    Device device = new Device("test","wz");



    HTTP.Main("http://server:8083/fhem/FileLog_logWrapper&dev=FileLog_BZ_Heizung&type=text&file=BZ_Heizung-2012.log","POST");
    System.out.println(device.getRoom());
	// write your code here
    }
}
