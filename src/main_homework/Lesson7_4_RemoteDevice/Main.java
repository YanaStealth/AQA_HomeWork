package main_homework.Lesson7_4_RemoteDevice;

public class Main {
    TV tv1 = new TV("SONY", true, 1, 5);
    TV tv2 = new TV("PANASONIC", true, 20, 100);
    RemoteController remote1 = new RemoteController(tv1); //инициализация поля TVDevice
    RemoteController remote2 = new RemoteController(tv2);

    public static void main(String[] args) {
        Main mainTv1 = new Main();

        mainTv1.print1();

        mainTv1.tv1.currentChannel();
        mainTv1.tv1.powerOn();
        mainTv1.tv1.setChannel(10);
        mainTv1.tv1.upVolume();
        mainTv1.tv1.downVolume();
        mainTv1.tv1.mute();
        mainTv1.tv1.powerOff();

        mainTv1.print2();
        mainTv1.print3();
        mainTv1.remote2.upVolume();
        mainTv1.remote2.downVolume();
        mainTv1.remote2.setChannel(100);
        mainTv1.remote2.switchTheCannel(mainTv1.tv1.getChannelNumber());
        mainTv1.remote2.currentChannel();
        mainTv1.remote2.disconnectDevice();

        mainTv1.print4();
        mainTv1.remote1.upVolume();
        mainTv1.remote1.downVolume();
        mainTv1.remote1.switchTheCannel(22);
        mainTv1.remote1.currentChannel();
        mainTv1.remote1.disconnectDevice();
    }

    public void print1() {
        System.out.println("Calling methods TV tv1=new TV");
    }

    public void print2() {
        System.out.println("TV modelName:" + tv1.modelName);
    }

    public void print3() {
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