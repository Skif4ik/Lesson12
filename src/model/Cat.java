package model;

import interfaces.IVoice;

public abstract class Cat extends Pet implements IVoice {

    public Cat() {
    }

    public Cat(String nickName, Color color) {
        super(nickName, color);
    }

    @Override
    public void voice() {
        System.out.println("Котик " + getNickName() + " мяукает");
    }
}
