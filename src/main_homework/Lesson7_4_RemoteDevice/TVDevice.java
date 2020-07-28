package main_homework.Lesson7_4_RemoteDevice;

abstract public class TVDevice implements Volume, Device {
    String modelName;
    boolean isOn = true;
    Volume vol;
    Device dev;

    public TVDevice(Volume vol, Device dev) {
        this.vol = vol;
        this.dev = dev;
    }

    public void upVolume() {
        vol.upVolume();
    }

    public void downVolume() {
        vol.downVolume();
    }

    public void mute() {
        vol.mute();
    }

    public void powerOn() {
        dev.powerOn();
    }

    public void powerOff() {
        dev.powerOff();
    }

    public void setChannel(int channel) {
        dev.setChannel(channel);
    }

    public void currentChannel() {
        dev.currentChannel();
    }

    public void switchTheChannel(int channel){
        System.out.println("switch Channel ->"+channel);
    }
    private boolean checkIfDeviceConnected(){
        System.out.println("isDeviceConnected ->");
        return isOn;
    }


}
