package ex06.example3;

import ex06.example4.Protoss;

public class Dragoon{
    String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("드라군이 공격합니다." + name);
    }
}
