package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Leg extends DrawingObject {

    public Leg(double cofX, double cofY, double cofWidth, double cofHeight, Color color){
        super(cofX, cofY, cofWidth,cofHeight,color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillRoundRect(
                    (int) (cofX * panelWidth),
                    (int) (cofY * panelHeight),
                    (int) (cofWidth * (panelWidth / 2)),
                    (int) (cofHeight * panelHeight),
                    (int) ((cofX + 0.1) * panelWidth),
                    (int) ((cofHeight - 0.1) * panelHeight)
            );
        });
    }
}
