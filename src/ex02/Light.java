package ex02;

public class Light {
    public static void main(String[] args) {
        final double LIGHT_SPEED = 3e5; // 3 * 10^5
        double distance;

        distance = LIGHT_SPEED * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년동안 가는 거리 : " + distance + " km.");
    }
}
