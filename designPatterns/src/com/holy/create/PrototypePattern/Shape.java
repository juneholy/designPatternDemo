package com.holy.create.PrototypePattern;

/**
 * Created by houlin.jiang on 16-4-26.
 */
public abstract class Shape implements Cloneable{
    private String id ;

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    abstract void draw();
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
