package main_homework.Lesson7_4_RemoteDevice;

public class RemoteController implements Device, Volume {
    TVDevice tvDevice;
    //TV tv;
    TV currentTV=new TV();

   public RemoteController(TVDevice tvDevice) {
        this.tvDevice = tvDevice;}

    public RemoteController() {
    }

    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
        System.out.println("Remote Controller: The device is connected. "); //полю tvDevice в твоєму ремоут контроллері добавляти обєкт твого tvDevice,этот метод должен выполнять функцию конструктора с одним параметром.законектити це тоді коли ти потім можеш оперувати законекчиним ТВ.і методи будуть працювати тільки з тим ТВ який законекчений
    }

    public void disconnectDevice() {
        currentTV.isOn = false;
        System.out.println("Remote Controller: The device is disconnected. " + currentTV.isOn);
    }

       public void switchTheCannel(int channelNumber) {  //use private variable of TV class
          // channelNumber =  tv.getChannelNumber();
           channelNumber++;
           System.out.println("New Сhannel ->"+channelNumber);

       }

    private boolean checkIfDeviceConnected() {
        if ( currentTV.isOn = true){
            System.out.println("Remote Controller: Checking if the device is connected = " + currentTV.isOn);
        } else{
            System.out.println("Remote Controller: Checking if the device is connected = " + currentTV.isOn);
        }
        return currentTV.isOn;
    }

    @Override
    public void upVolume() {
        currentTV.upVolume();

        System.out.println("Up Volume is called from Remote Controller");
    }

    @Override
    public void downVolume() {
        currentTV.downVolume();
        System.out.println("Volume is called from Remote Controller");
    }

    @Override
    public void mute() {
        currentTV.mute();
        System.out.println("Mute is called from Remote Controller");
    }

    @Override
    public void powerOn() {
        currentTV.powerOn();
        System.out.println("Power On is called from Remote Controller");
    }

    @Override
    public void powerOff() {
        currentTV.powerOff();
        System.out.println("Power On is called from Remote Controller");
    }

    @Override
    public void setChannel(int channel) {
        currentTV.setChannel(channel);
        System.out.println("Channel is set from Remote Controller" + channel);
    }

    @Override
    public void currentChannel() {
        currentTV.currentChannel();
        System.out.println("currentChannel is called from Remote Controller");
    }
}


  /*  @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public void connectDevice(TVDevice tvDevice) {
    }              //connectDevice у меня в пульте чтобы подключить телевизор
    void disconnectDevice() {
    }*/