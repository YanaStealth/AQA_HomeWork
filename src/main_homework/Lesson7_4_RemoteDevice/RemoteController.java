package main_homework.Lesson7_4_RemoteDevice;

public class RemoteController implements Device, Volume {
    TVDevice tvDevice;
    //TV tv;
   // TV currentTV=new TV();

   public RemoteController(TVDevice tvDevice) {
        this.tvDevice = tvDevice;}

    public RemoteController() {
    }

    public void connectDevice(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
        System.out.println("Remote Controller: The device is connected. "); //полю tvDevice в твоєму ремоут контроллері добавляти обєкт твого tvDevice,этот метод должен выполнять функцию конструктора с одним параметром.Ты используешь не методы абстрактного класса, а методы обьекта который лежит по ссылке. используешь методы из объекта, а не абстракции. Что засунешь в то поле, то и будет твоим объектом у которого ты будешь вызывать методы

    public void disconnectDevice() {
        tvDevice.isOn = false;
        System.out.println("Remote Controller: The device is disconnected. " + tvDevice.isOn);
    }

       public void switchTheCannel(int channelNumber) {  //use private variable of TV class
          // channelNumber =  tv.getChannelNumber();
           channelNumber++;
           System.out.println("New Сhannel ->"+channelNumber);

       }

    private boolean checkIfDeviceConnected() {
        if ( tvDevice.isOn = true){
            System.out.println("Remote Controller: Checking if the device is connected = " + tvDevice.isOn);
        } else{
            System.out.println("Remote Controller: Checking if the device is connected = " + tvDevice.isOn);
        }
        return tvDevice.isOn;
    }

    @Override
    public void upVolume() {
        tvDevice.upVolume();

        System.out.println("Up Volume is called from Remote Controller");
    }

    @Override
    public void downVolume() {
        tvDevice.downVolume();
        System.out.println("Volume is called from Remote Controller");
    }

    @Override
    public void mute() {
        tvDevice.mute();
        System.out.println("Mute is called from Remote Controller");
    }

    @Override
    public void powerOn() {
        tvDevice.powerOn();
        System.out.println("Power On is called from Remote Controller");
    }

    @Override
    public void powerOff() {
        tvDevice.powerOff();
        System.out.println("Power On is called from Remote Controller");
    }

    @Override
    public void setChannel(int channel) {
        tvDevice.setChannel(channel);
        System.out.println("Channel is set from Remote Controller" + channel);
    }

    @Override
    public void currentChannel() {
        tvDevice.currentChannel();
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