package main_homework.Lesson7_4_RemoteDevice;

public class Main {
    TV tv1 = new TV("SONY", true, 1, 5);
    RemoteController remote1 = new RemoteController();
    RemoteController remote2 = new RemoteController(tv1);

    public static void main(String[] args) {
    Main mainTv1=new Main();




        public void print1();

        tv1.currentChannel();
        tv1.powerOn();
        tv1.setChannel(10);
        tv1.upVolume();
        tv1.downVolume();
        tv1.mute();
        tv1.powerOff();
        public void print2(){
            System.out.println("TV modelName:" + tv1.modelName);
        }

        public void print3();

        remote2.checkIfDeviceConnected();
        if (remote2.tvDevice.isOn = false) {
            remote2.connectDevice(TVDevice);
        }
        remote2.upVolume();
        remote2.downVolume();
        remote2.switchTheCannel(4444);
        remote2.currentChannel();
        remote2.disconnectDevice();


        public void print4();

        remote1.upVolume();
        remote1.downVolume();
        remote1.switchTheCannel(22);
        remote1.currentChannel();
        remote1.disconnectDevice();
            }
    public void print1() {
        System.out.println("Calling methods TV tv1=new TV");
    }
    public void print2(){
        System.out.println("TV modelName:" + tv1.modelName);
    }
    public void print3(){
        System.out.println("Calling methods TV tv1=new TV via Remote Controller  RemoteController remote2=new RemoteController(tv1) ");
    }
    public void print4() {
        System.out.println("Calling methods RemoteController remote1=new RemoteController()");
    }
}


 /*  Device dev = new RemoteController();
       Volume vol = new RemoteController();
       TV tv1 = new TV(vol, dev);
       tv1.setChannel(100);*/