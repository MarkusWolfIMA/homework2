package fh.java.geometry.model.threedimensional;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by Markus on 08.11.2016.
 */
public abstract class ThreeDimensionalShape extends GeometricShape
{
    protected double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract double calcVolume();

    public abstract double calcSurface();
}
