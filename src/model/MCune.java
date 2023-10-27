package model;

import interfaces.IPlay;
import interfaces.ISwim;

public class MCune extends Cat implements ISwim, IPlay {

    public MCune() {
    }

    public MCune(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void eat() {
        System.out.println("Мейн кун " + getNickName() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Мейн кун " + getNickName() + " плывет");
    }

    @Override
    public void play() {
        System.out.println("Мейн кун " + getNickName() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Мейн кун " + getNickName() + " виляет хвостом");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.MCune{");
        sb.append("nickName='").append(getNickName()).append('\'');
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }
}
