package com.JonasWeb.FhemControl.Devices;

/**
 * Created by jonas on 14.04.15.
 */
public class Device {

    private String name;
    private String room;

    private String linkMask;

    public Device (String name, String room) {

        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLinkMask() {
        return linkMask;
    }

    public void setLinkMask(String linkMask) {
        this.linkMask = linkMask;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
