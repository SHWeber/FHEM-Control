package com.JonasWeb.FhemControl.Devices;

/**
 * Created by jonas on 14.04.15.
 */
public class Light extends Device {

    public Light(String name, String room) {
        super(name, room);
    }



    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
