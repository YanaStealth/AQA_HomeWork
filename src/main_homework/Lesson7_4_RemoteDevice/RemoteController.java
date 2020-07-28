package main_homework.Lesson7_4_RemoteDevice;

public class RemoteController implements Device,Volume {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void connectDevice(TVDevice tvDevice){}              //connectDevice у меня в пульте чтобы подключить телевизор
     void disconnectDevice(){}

    @Override
    public void upVolume() {
        System.out.println("upVolume");
    }

    @Override
    public void downVolume() {
        System.out.println("downVolume");
    }

    @Override
    public void mute() {
        System.out.println("mute");
    }

    @Override
    public void powerOn() {
        System.out.println("powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("channel ->"+channel);
    }

    @Override
    public void currentChannel() {
        System.out.println("currentChannel");
    }
}
