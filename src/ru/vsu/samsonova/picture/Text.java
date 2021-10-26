package ru.vsu.samsonova.picture;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Text extends DrawingObject {
    public Text(double cofX, double cofY, Color color) {
        super(cofX, cofY, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        drawWithColor(gr, this.color, () ->
        {
            Font font = new Font("Coople Black", Font.BOLD, 26);
            gr.setFont(font);
            gr.drawString("Happy Day",
                    (int) (cofX * panelWidth),
                    (int) (cofY * panelHeight));
        });
    }
}
