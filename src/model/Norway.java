package model;

import interfaces.IPlay;
import interfaces.ISwim;

public class Norway extends Cat implements ISwim, IPlay {

    public Norway() {
    }

    public Norway(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void eat() {
        System.out.println("Норвежский кот " + getNickName() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Норвежский кот " + getNickName() + " плывет");
    }

    @Override
    public void play() {
        System.out.println("Норвежский кот " + getNickName() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Норвежский кот " + getNickName() + " виляет хвостом");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Norway{");
        sb.append("nickName='").append(getNickName()).append('\'');
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }
}
