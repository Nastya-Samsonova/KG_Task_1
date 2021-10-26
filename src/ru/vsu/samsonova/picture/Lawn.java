package ru.vsu.samsonova.picture;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Lawn extends DrawingObject {

    private List<Flower> lawn = new LinkedList<>();

    public Lawn(double cofX, double cofY) {
        super(cofX, cofY);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        lawn.add(new Flower(cofX + 0.1, cofY - 0.1, 0.01, 0.01));
        lawn.add(new Flower(cofX + 0.4, cofY + 0.05, 0.01, 0.01));
        lawn.add(new Flower(cofX + 0.7, cofY - 0.1, 0.01, 0.01));
        lawn.add(new Flower(cofX + 0.2, cofY + 0.07, 0.01,0.01));
        lawn.add(new Flower(cofX + 0.5, cofY - 0.14, 0.01, 0.01));
        lawn.add(new Flower(cofX - 0.15, cofY + 0.17, 0.01,0.01));
        lawn.add(new Flower(cofX - 0.13, cofY + 0.06, 0.01,0.01));
        lawn.add(new Flower(cofX + 0.65, cofY + 0.2, 0.01,0.01));
        lawn.add(new Flower(cofX + 0.4, cofY + 0.22, 0.01,0.01));
        lawn.add(new Flower(cofX + 0.55, cofY + 0.07,0.01,0.01));
        lawn.add(new Flower(cofX - 0.01,cofY +0.05,0.01,0.01));
        lawn.add(new Flower(cofX - 0.08,cofY - 0.14,0.01,0.01));
        lawn.add(new Flower(cofX + 0.05, cofY + 0.2, 0.01,0.01));


        for (Flower flower : lawn) {
            flower.draw(gr, panelWidth, panelHeight);
        }

    }
}
