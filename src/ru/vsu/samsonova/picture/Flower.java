package ru.vsu.samsonova.picture;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Flower extends DrawingObject {
    public Flower(double cofX, double cofY, double cofWidth, double cofHeight) {
        super(cofX, cofY, cofWidth, cofHeight);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        Color petalColor = new Color(0xFDFDFC);
        drawWithColor(gr, petalColor, () ->
        {
            double da = 2 * Math.PI / 5;
            for (int i = 0; i < 5; i++) {
                double a = da * i;
                double x = (cofX - 0.01) - (cofWidth + 0.005) * Math.cos(a);
                double y = (cofY - 0.013) - (cofHeight + 0.005) * Math.sin(a);

                gr.fillOval(
                        (int) (x * panelWidth),
                        (int) (y * panelHeight),
                        (int) (2 * cofWidth * panelWidth),
                        (int) (2 * cofWidth * panelWidth));
            }
        });

        Color centerColor = new Color(0xFCE66F);
        drawWithColor(gr, centerColor, () ->
        {
            gr.fillOval(
                    (int) ((cofX * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofWidth * panelWidth));
        });
    }

}
