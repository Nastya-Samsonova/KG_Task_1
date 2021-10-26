package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Glasses extends DrawingObject {

    public Glasses(double cofX, double cofY, double cofWidth, double cofHeight, Color color) {
        super(cofX, cofY, cofWidth, cofHeight, color);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        drawWithColor(gr, this.color, () ->
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

            gr.setStroke(new BasicStroke(10));
                double x1_1 = (cofX - 0.06) + cofWidth * Math.cos(45);
                double y1_1 = (cofY - 0.08) + cofWidth * Math.sin(45);
                double x2_1 = (cofX - 0.06) + (cofWidth + 0.03) * Math.cos(45);
                double y2_1 = (cofY - 0.08) + (cofWidth + 0.03) * Math.sin(45);
                gr.drawLine(
                        (int) (x1_1 * panelWidth),
                        (int) (y1_1 * panelHeight),
                        (int) (x2_1 * panelWidth),
                        (int) (y2_1 * panelHeight));

            gr.setStroke(new BasicStroke(10));
            double x1_2 = (cofX + 0.0763) + cofWidth * Math.cos(-45);
            double y1_2 = cofY + cofWidth * Math.sin(-45);
            double x2_2 = (cofX + 0.0763) + (cofWidth + 0.03) * Math.cos(-45);
            double y2_2 = cofY + (cofWidth + 0.03)  * Math.sin(-45);
            gr.drawLine(
                    (int) (x1_2 * panelWidth),
                    (int) (y1_2 * panelHeight),
                    (int) (x2_2 * panelWidth),
                    (int) (y2_2 * panelHeight));
        });
    }
}
