package ru.vsu.samsonova.picture;

import ru.vsu.samsonova.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Balloon extends DrawingObject {
    private final double[] x;
    private final double[] y;


    public Balloon(double cofX, double cofY, double cofWidth, double cofHeight) {
        super(cofX, cofY, cofWidth, cofHeight);

        this.x = new double[]{cofX - 0.01, (cofX - 0.01) + (cofWidth - 0.045) / 2, (cofX - 0.01) + (cofWidth - 0.045)};
        this.y = new double[]{cofY + 0.125, (cofY + 0.125) - (cofHeight - 0.045), cofY + 0.125};
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        Color threadColor = new Color(0x34040F);
        drawWithColor(gr, threadColor, () ->
        {
            gr.setStroke(new BasicStroke(2));
            double x1 = (cofX - 0.13) + (cofWidth + 0.2) * Math.cos(45);
            double y1 = (cofY - 0.11) + (cofWidth + 0.2) * Math.sin(45);
            double x2 = (cofX - 0.315) + (cofWidth + 0.09) * Math.cos(45);
            double y2 = (cofY + 0.25) + (cofWidth + 0.09) * Math.sin(45);
            gr.drawLine(
                    (int) (x1 * panelWidth),
                    (int) (y1 * panelHeight),
                    (int) (x2 * panelWidth),
                    (int) (y2 * panelHeight));
        });
        Color balloonColor = new Color(0xEA1842);
        drawWithColor(gr, balloonColor, () ->
        {
            gr.fillOval(
                    (int) ((cofX * panelWidth) - (cofWidth * panelWidth)),
                    (int) ((cofY * panelHeight) - (cofWidth * panelWidth)),
                    (int) (2 * cofWidth * panelWidth),
                    (int) (2 * cofWidth * panelWidth));

            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth)),
                    ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight)), 3);
        });

    }
}
