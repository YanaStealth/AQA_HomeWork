package main_homework.Lesson7_4_RemoteDevice;

public class TV extends TVDevice {

    /* public TV(Volume vol, Device dev) {
         super(vol, dev);
     }*/
    private int channelNumber;
    private int volumeLevel;

    public TV() {
            }

    public TV(String modelName, boolean isOn, int channelNumber, int volumeLevel) {
        super(modelName, isOn);
        this.channelNumber = channelNumber;
        this.volumeLevel = volumeLevel;
    }

    public int getChannelNumber()
    {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    @Override
    public void currentChannel() {
        System.out.println("TV: The current Channel is: " + channelNumber);
    }

    @Override
    public void powerOn() {
        System.out.println("TV: The TV is ON." + super.isOn);
        super.isOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("TV: The TV is OFF." + super.isOn);
        super.isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        //setChannel(channel);
        channelNumber = channel;
        System.out.println("TV: Setting a specific channel:" + channel);
    }

    @Override
    public void upVolume() {
        volumeLevel = volumeLevel + 1;
        System.out.println("TV: Setting volume: up. The Level is: " + volumeLevel);
    }

    @Override
    public void downVolume() {
        volumeLevel = volumeLevel - 1;
        System.out.println("TV: Setting volume: down. The Level is: " + volumeLevel);
    }

    @Override
    public void mute() {
        volumeLevel = 0;
        System.out.println("TV: Setting volume: mute.The Level is: " + volumeLevel);
    }
}
