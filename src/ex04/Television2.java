package ex04;

public class Television2 {
    int channel;
    int volume;
    boolean onOff;

    Television2(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("나의 텔레비전 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}
