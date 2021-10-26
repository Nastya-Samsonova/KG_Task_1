package ru.vsu.samsonova.picture;

import java.awt.*;
import java.util.ArrayList;

public abstract class CompositionOfDrawingObject extends DrawingObject {
    private ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    public CompositionOfDrawingObject(double cofX, double cofY, double cofWidth, double cofHeight, Color color){
        super(cofX, cofY, cofWidth, cofHeight, color);
    }

    public ArrayList<DrawingObject> getObjects()
    {
        return drawingObjects;
    }

    @Override
    public void draw(Graphics2D gr, int panelWidth, int panelHeight)
    {
        if (drawingObjects != null)
        {
            this.drawingObjects.forEach(drawingObject -> drawingObject.draw(gr, panelWidth, panelHeight));
        }
    }
}

