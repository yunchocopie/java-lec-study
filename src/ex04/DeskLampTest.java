package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn();
        System.out.println(myLamp); // toString 문법
        myLamp.turnOff();
        System.out.println(myLamp);
    }
}
