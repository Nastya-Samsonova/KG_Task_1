package ru.vsu.samsonova.picture;

import java.awt.*;

public abstract class DrawingObject {

    protected final double cofX;
    protected final double cofY;
    protected final double cofWidth;
    protected final double cofHeight;
    protected final Color color;

    public DrawingObject (double cofX, double cofY, double cofWidth, double cofHeight, Color color){
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofWidth = cofWidth;
        this.cofHeight = cofHeight;
        this.color = color;
    }

    public DrawingObject(double cofX, double cofY, double cofWidth, double cofHeight) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofWidth = cofWidth;
        this.cofHeight = cofHeight;
        color = null;
    }

    public DrawingObject(double cofX, double cofY, double cofWidth) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofWidth = cofWidth;
        cofHeight = 0;
        color = null;
    }

    public DrawingObject(double cofX, double cofY, Color color) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.color = color;
        cofWidth = 0;
        cofHeight = 0;
    }

    public DrawingObject(double cofX, double cofY) {
        this.cofX = cofX;
        this.cofY = cofY;
        color = null;
        cofWidth = 0;
        cofHeight = 0;
    }

    public abstract void draw(Graphics2D gr, int panelWidth, int panelHeight);
}
