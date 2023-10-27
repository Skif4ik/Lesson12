package model;

public abstract class Pet {
    private String nickName;
    private Color color;

    public Pet() {
    }

    public Pet(String nickName, Color color) {
        this.nickName = nickName;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void eat();
}
