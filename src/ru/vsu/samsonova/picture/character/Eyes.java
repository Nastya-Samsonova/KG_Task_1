package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Eyes extends DrawingObject {
    public Eyes(double cofX, double cofY, double cofWidth, double cofHeight) {
        super(cofX, cofY, cofWidth, cofHeight);

    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        Color eyeColor = new Color(0xEEE5F1);
        drawWithColor(gr, eyeColor, () ->
        {
            gr.fillOval(
                    (int) ((cofX * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofHeight * panelWidth));

            gr.fillOval(
                    (int) (((cofX + 0.065) * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofHeight * panelWidth));
        });

        Color pupilColor = new Color(0x100101);
        drawWithColor(gr, pupilColor, () ->
        {
            gr.fillOval(
                    (int) (((cofX + 0.01) * panelWidth) - ((cofWidth - 0.016) * panelWidth)),
                    (int) (((cofY - 0.01) * panelHeight) - ((cofWidth - 0.016) * panelWidth)),
                    (int) (2 * (cofWidth - 0.016) * panelWidth),
                    (int) (2 * (cofHeight - 0.016) * panelWidth));

            gr.fillOval(
                    (int) (((cofX + 0.075) * panelWidth) - ((cofWidth - 0.016) * panelWidth)),
                    (int) (((cofY - 0.01) * panelHeight) - ((cofWidth - 0.016) * panelWidth)),
                    (int) (2 * (cofWidth - 0.016) * panelWidth),
                    (int) (2 * (cofHeight - 0.016) * panelWidth));
        });
    }
}

