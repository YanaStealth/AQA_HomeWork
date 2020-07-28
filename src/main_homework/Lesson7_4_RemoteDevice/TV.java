package main_homework.Lesson7_4_RemoteDevice;

public class TV extends TVDevice{

    public TV(Volume vol, Device dev) {
        super(vol, dev);
    }

    public void setChannel(int channel) {
        setChannel(channel);
        System.out.println("Setting a specific channel");
    }



}
