package model;

import interfaces.IPlay;

public class British extends Cat implements IPlay {

    public British() {
    }

    public British(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void eat() {
        System.out.println("Британский кот " + getNickName() + " кушает");
    }

    @Override
    public void play() {
        System.out.println("Британский кот " + getNickName() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Британский кот " + getNickName() + " виляет хвостом");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.British{");
        sb.append("nickName='").append(getNickName()).append('\'');
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }
}
