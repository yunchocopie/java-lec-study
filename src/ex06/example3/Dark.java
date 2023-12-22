package ex06.example3;

import ex06.example4.Protoss;

public class Dark{
    String name;

    public Dark(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("다크가 공격합니다." + name);
    }
}
