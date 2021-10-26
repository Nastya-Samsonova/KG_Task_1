package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;
import ru.vsu.samsonova.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class NoseAndMouth extends DrawingObject {

    private final double[] x;
    private final double[] y;

    public NoseAndMouth(double cofX, double cofY, double cofWidth, double cofHeight) {
        super(cofX, cofY, cofWidth, cofHeight);

        this.x = new double[]{cofX, cofX + cofWidth / 2.0, cofX + cofWidth};
        this.y = new double[]{cofY, cofY + cofHeight, cofY,};
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        Color mouthColor = new Color(0x030003);
        drawWithColor(gr, mouthColor, () ->
        {
            gr.setStroke(new BasicStroke(4));
            gr.drawArc(
                    (int) ((cofX - 0.004) * panelWidth),
                    (int) ((cofY + 0.037) * panelHeight),
                    (int) ((cofWidth + 0.01) * panelWidth),
                    (int) (cofHeight * panelHeight),
                    (180),
                    (180)
            );
            double x1 = cofX + 0.0141;
            double y1 = cofY + 0.029;
            double x2 = x1;
            double y2 = (cofY + 0.034) + cofHeight;
            gr.drawLine(
                    (int) (x1 * panelWidth),
                    (int) (y1 * panelHeight),
                    (int) (x2 * panelWidth),
                    (int) (y2 * panelHeight));
        });

        Color noseColor = new Color(0x030003);
        drawWithColor(gr, noseColor, () ->
        {
            gr.fillPolygon(ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(x, panelWidth)),
                    ArrayUtil.toIntArray(ArrayUtil.multiplyArrayBy(y, panelHeight)), 3);
        });


    }
}