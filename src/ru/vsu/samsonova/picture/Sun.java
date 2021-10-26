package ru.vsu.samsonova.picture;

import java.awt.*;
import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Sun extends DrawingObject{
    private final int n = 15;
    private final double l = 0.1;

    public Sun(double cofX, double cofY, double cofWidth, double cofHeight, Color color){
        super(cofX, cofY, cofWidth, cofHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        drawWithColor(gr, this.color, () ->
        {
            gr.fillOval(
                    (int) ((cofX * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofWidth * panelWidth));

            double da = 2 * Math.PI / n;
            gr.setStroke(new BasicStroke(3));
            for (int i = 0; i < n; i++) {
                double a = da * i;
                double x1 = cofX + cofWidth * Math.cos(a);
                double y1 = cofY + cofWidth * Math.sin(a);
                double x2 = cofX + (cofWidth + l) * Math.cos(a);
                double y2 = cofY + (cofWidth + l) * Math.sin(a);
                gr.drawLine(
                        (int) (x1 * panelWidth),
                        (int) (y1 * panelHeight),
                        (int) (x2 * panelWidth),
                        (int) (y2 * panelHeight));
            }
        });
    }
}
