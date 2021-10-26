package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Body extends DrawingObject {

    public Body(double cofX, double cofY, double cofWigth, double cofHeight, Color color) {
        super(cofX, cofY, cofWigth, cofHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillOval(
                    (int) ((cofX * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofWidth * panelWidth));
        });

    }
}
