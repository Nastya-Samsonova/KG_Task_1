package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Ear extends DrawingObject {
    public Ear(double cofX, double cofY, double cofWidth, double cofHeight, Color color){
        super(cofX, cofY, cofWidth, cofHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillOval(
                    (int) (cofX * panelWidth),
                    (int) (cofY * panelHeight),
                    (int) (cofWidth * panelWidth),
                    (int) (cofWidth * panelHeight));
        });
    }

}
