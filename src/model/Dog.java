package model;

import interfaces.IPlay;
import interfaces.ISwim;
import interfaces.IVoice;

public class Dog extends Pet implements IVoice, ISwim, IPlay {

    public Dog() {
    }

    public Dog(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void eat() {
        System.out.println("Собачка " + getNickName() + " кушает");
    }

    @Override
    public void voice() {
        System.out.println("Собачка " + getNickName() + " лает");
    }

    @Override
    public void swim() {
        System.out.println("Собачка " + getNickName() + " плывет");
    }

    @Override
    public void play() {
        System.out.println("Собачка " + getNickName() + " играет");
    }

    @Override
    public void wag() {
        System.out.println("Собачка " + getNickName() + " виляет хвостом");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Dog{");
        sb.append("nickName='").append(getNickName()).append('\'');
        sb.append(", color=").append(getColor());
        sb.append('}');
        return sb.toString();
    }
}
