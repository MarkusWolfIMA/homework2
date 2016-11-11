package fh.java.geometry.model.threedimensional;

/**
 * Created by Markus on 09.11.2016.
 */
public class Cuboid extends ThreeDimensionalShape{
    private double height;

    public Cuboid(int x, int y, double height) {
        this.x=x;
        this.y = y;
        this.height = height;
    }


    public double getHeight(){return height;}

    public void setHeight(double height){this.height = height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cuboid cuboid = (Cuboid)o;

        return (Double.compare(cuboid.getX(), x) == 0 && Double.compare(cuboid.getY(),y) == 0 && Double.compare(cuboid.getHeight(),height)==0);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(x/y+y%x);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("x=").append(x);
        sb.append("y=").append(y);
        sb.append(", height=").append(height);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface==").append(calcSurface());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcVolume() {
        return (x*y*height);
    }

    @Override
    public double calcSurface() {
        return 2*(x*y+x*height+y*height);
    }
}
