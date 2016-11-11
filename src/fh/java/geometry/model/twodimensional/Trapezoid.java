package fh.java.geometry.model.twodimensional;

/**
 * Created by Markus on 07.11.2016.
 */
public class Trapezoid  extends TwoDimensionalShape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapezoid(int x, int y,double sideA, double sideB,double sideC,double sideD, double height) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() { return sideC; }

    public void setSideC(double sideC) {this.sideC = sideC;}

    public double getSideD() { return sideD; }

    public void setSideD(double sideD) { this.sideD = sideD; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezoid that = (Trapezoid ) o;

        if ((Double.compare(that.sideA, sideA) != 0) &&
                (Double.compare(that.sideB, sideB) != 0) &&
                (Double.compare(that.sideC, sideC) != 0) &&
                (Double.compare(that.sideD, sideD) != 0)&&
                (Double.compare(that.height,height)!= 0)){
            return true;
        }

        return false;

    }


    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RightTriangle{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideD=").append(sideD);
        sb.append(", height=").append(height);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return (sideA+sideC)/2*height;
    }

    @Override
    public double calcPerimeter() {
        return sideA+sideB+sideC+sideD;
    }

}
