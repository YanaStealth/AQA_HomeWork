package main_homework.Lesson7_4_RemoteDevice;

public class Main {
    public static void main(String[] args) {
     /*  Device dev = new RemoteController();
       Volume vol = new RemoteController();
       TV tv1 = new TV(vol, dev);
       tv1.setChannel(100);*/
        TV tv1 = new TV("SONY", true, 1, 5);
        RemoteController remote1 = new RemoteController();
        RemoteController remote2 = new RemoteController(tv1);

        public void print () {
            System.out.println("Calling methods TV tv1=new TV");
        }
        tv1.currentChannel();
        tv1.powerOn();
        tv1.setChannel(10);
        tv1.upVolume();
        tv1.downVolume();
        tv1.mute();
        tv1.powerOff();
        public void print () {
            System.out.println("TV modelName:" + tv1.modelName);
        }

        public void print () {
            System.out.println("Calling methods TV tv1=new TV via Remote Controller  RemoteController remote2=new RemoteController(tv1) ");
        }
        remote2.checkIfDeviceConnected();
        if (remote2.tvDevice.isOn = false) {
            remote2.connectDevice(TVDevice);
        }
        remote2.upVolume();
        remote2.downVolume();
        remote2.switchTheCannel(4444);
        remote2.currentChannel();
        remote2.disconnectDevice();
        remote2.checkIfDeviceConnected();

        public void print () {
            System.out.println("Calling methods RemoteController remote1=new RemoteController();");
        }
        remote1.checkIfDeviceConnected();
        if (remote1.tvDevice.isOn = false) {
            remote1.connectDevice(TVDevice);
        }
        remote1.upVolume();
        remote1.downVolume();
        remote1.switchTheCannel(22);
        remote1.currentChannel();
        remote1.disconnectDevice();
        remote1.checkIfDeviceConnected();
    }

}
