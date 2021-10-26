package ru.vsu.samsonova.picture;

import java.awt.*;
import static ru.vsu.samsonova.util.DrawUtil.drawWithColor;

public class Background extends DrawingObject {

    public Background(double cofX, double cofY, double cofWidth, double cofHeight) {

        super(cofX, cofY, cofWidth, cofHeight);
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight){

        Color skyColor = new Color(0x78CCE8);
        drawWithColor(gr, skyColor, () -> {
            gr.fillRect(
                    (int) (cofX * panelWidth),
                    (int) (cofY * panelHeight),
                    (int) (cofWidth * panelWidth),
                    (int) (cofHeight * (panelHeight / 2))
            );
        });

        Color earthColor = new Color(0x8AD25E);
        drawWithColor(gr, earthColor, () -> {
            gr.fillRect(
                    (int) (cofX * panelWidth),
                    (int) ((cofY + 1) * (panelHeight) / 2),
                    (int) (cofWidth * panelWidth),
                    (int) (cofHeight * (panelHeight / 2))
            );
        });


    }

}
