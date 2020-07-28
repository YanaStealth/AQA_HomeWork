package main_homework.Lesson7_4_RemoteDevice;

public class Main {
    public static void main(String[] args) {
       Device dev = new RemoteController();
       Volume vol = new RemoteController();
       TV tv1 = new TV(vol, dev);
       tv1.setChannel(100);
    }
}
