package fh.java.geometry.model.threedimensional;

/**
 * Created by Markus on 07.11.2016.
 */
public class Cylinder extends ThreeDimensionalShape {

    private double radius;
    private double height;

    public Cylinder(int x, int y,double radius,double height) {
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight(){return height;}

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height){this.height = height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cylinder cylinder = (Cylinder) o;

        return (Double.compare(cylinder.radius, radius) == 0 && Double.compare(cylinder.height,height)==0);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius*height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface==").append(calcSurface());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcVolume() {
        return this.radius*this.radius*Math.PI*height;
    }

    @Override
    public double calcSurface() {
        return 2*this.radius*Math.PI*height+2*radius*radius*Math.PI;
    }
}
