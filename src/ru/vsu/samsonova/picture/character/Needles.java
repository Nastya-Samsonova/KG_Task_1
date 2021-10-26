package ru.vsu.samsonova.picture.character;

import ru.vsu.samsonova.picture.DrawingObject;
import ru.vsu.samsonova.util.ArrayUtil;

import java.awt.*;

import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Needles extends DrawingObject {

    public Needles(double cofX, double cofY, double cofWidth, double cofHeight, Color color) {
        super(cofX, cofY, cofWidth, cofHeight, color);
    }

    double radius = cofWidth;
    double triangleHeight = cofHeight;
    int numberOfTriangles = 5;
    double rOuter = radius + triangleHeight;

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight) {
        drawWithColor(gr, this.color, () ->
        {
            double angle = Math.PI / numberOfTriangles;
            double delta = Math.PI / numberOfTriangles / 2;

            for (int i = 0; i < numberOfTriangles; i++) {
                double firstA = angle * i;
                double b = firstA + delta;
                double secondA = (firstA + angle);

                double x1 = cofX - radius * Math.cos(firstA);
                double y1 = cofY - radius * Math.sin(firstA);

                double x2 = cofX - radius * Math.cos(secondA);
                double y2 = cofY - radius * Math.sin(secondA);

                double x3 = cofX - rOuter * Math.cos(b);
                double y3 = cofY - rOuter * Math.sin(b);

                double[] xCoordinates = {x1 * panelWidth, x2 * panelWidth, x3 * panelWidth};
                double[] yCoordinates = {y1 * panelHeight, y2 * panelHeight, y3 * panelHeight};

                gr.fillPolygon(ArrayUtil.toIntArray(xCoordinates), ArrayUtil.toIntArray(yCoordinates), 3);
            }
        });
    }
}




