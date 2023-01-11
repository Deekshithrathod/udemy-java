package section12;

class TV {
    public void changeChannel() {
        System.out.println("TV Change Channel");
    }

    public void switchOn() {
        System.out.println("TV Switch On");
    }
}

class SmartTV extends TV {
    public void changeChannel() {
        System.out.println("SmartTV Change Channel");
    }

    public void switchOn() {
        System.out.println("SmartTV Switch On");
    }

    public void browseChannels() {
        System.out.println("Smart Tv browse Channels");
    }
}

public class Lecture128 {
    public static void main(String[] args) {
//        TV tv = new TV();
//        tv.changeChannel();
//        tv.switchOn();

//        SmartTV smartTV = new SmartTV();
//        smartTV.browseChannels();
//        smartTV.changeChannel();
//        smartTV.switchOn();
        TV su = new SmartTV();
        su.switchOn();
        su.changeChannel();
//        su.browseChannels();
    }
}
