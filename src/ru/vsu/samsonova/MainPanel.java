package ru.vsu.samsonova;

import ru.vsu.samsonova.picture.*;
import ru.vsu.samsonova.picture.character.*;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private final World world;

    public MainPanel(){
        this.world = new World(0, 0, 1, 1, Color.WHITE);

        world.getObjects().add(new Background(0,0,1,1));
        world.getObjects().add(new Sun(0.2,0.15, 0.05, 0.05, new Color(0xF6DA4C)));

        world.getObjects().add(new Leg(0.45, 0.6, 0.08, 0.12, new Color(0xD032B8)));
        world.getObjects().add(new Leg(0.512, 0.6, 0.08, 0.12, new Color(0xD032B8)));

        world.getObjects().add(new Hand(0.385, 0.5, 0.06, 0.1, new Color(0xD032B8)));
        world.getObjects().add(new Hand(0.5855, 0.5, 0.06, 0.1, new Color(0xD032B8)));

        world.getObjects().add(new Needles(0.5,0.471,0.1,0.1,new Color(0x490465)));

        world.getObjects().add(new Ear(0.385, 0.42, 0.07, 0.001, new Color(0xD032B8)));
        world.getObjects().add(new Ear(0.543, 0.42, 0.07, 0.001, new Color(0xD032B8)));

        world.getObjects().add(new Body(0.5, 0.5, 0.1,0.1, new Color(0xD032B8)));
        world.getObjects().add(new NoseAndMouth(0.485, 0.51, 0.027, 0.027));
        world.getObjects().add(new Glasses(0.467, 0.47, 0.033, 0.033, new Color(0x210214)));

        world.getObjects().add(new Eyes(0.467, 0.47, 0.024, 0.024));

        world.getObjects().add(new Balloon(0.84, 0.2, 0.07, 0.07));
        world.getObjects().add(new Text(0.78, 0.2, new Color(0xB8D95B)));

        world.getObjects().add(new Lawn(0.2,0.7));

    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gr2d = (Graphics2D) g;
        super.paint(g);

        this.world.draw(gr2d, this.getWidth(), this.getHeight());
    }

}
