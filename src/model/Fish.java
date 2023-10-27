package model;

import interfaces.ISwim;
import interfaces.IWag;

public class Fish extends Pet implements ISwim, IWag {

    public Fish() {
    }

    public Fish(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void eat() {
        System.out.println("Рыбка " + getNickName() + " кушает");
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + getNickName() + " плавает");
    }

    @Override
    public void wag() {
        System.out.println("Рыбка " + getNickName() + " виляет хвостом");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Fish{");
        sb.append("nickName='").append(getNickName()).append('\'');
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }
}
