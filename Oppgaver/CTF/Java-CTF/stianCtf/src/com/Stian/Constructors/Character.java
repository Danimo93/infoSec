package com.Stian.Constructors;

public class Character {
    //FIELD
    private int ID;
    private String name;
    private int x;
    private int y;

    //CONSTRUCTOR
    public Character(int ID, String name, int x, int y){
        this.ID = ID;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //PRINT


    //GET & SET
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
