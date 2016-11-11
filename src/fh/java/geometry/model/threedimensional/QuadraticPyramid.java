package fh.java.geometry.model.threedimensional;

/**
 * Created by Markus on 07.11.2016.
 */
public class QuadraticPyramid extends ThreeDimensionalShape{
    private double height;

    public QuadraticPyramid(int x, double height) {
        this.x=x;
        this.y = x;
        this.height = height;
    }


    public double getHeight(){return height;}

    public void setHeight(double height){this.height = height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        QuadraticPyramid pyramid = (QuadraticPyramid) o;

        return (Double.compare(pyramid.getX(), x) == 0 && Double.compare(pyramid.height,height)==0);

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
        sb.append(", height=").append(height);
        sb.append(", volume=").append(calcVolume());
        sb.append(", surface==").append(calcSurface());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcVolume() {
        return (x*x*height/3);
    }

    @Override
    public double calcSurface() {
        double h = Math.sqrt((x*x)+(height*height));
        return (x*x+(2*x*h));
    }
}
