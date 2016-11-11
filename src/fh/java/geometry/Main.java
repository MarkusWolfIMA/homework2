package fh.java.geometry;

import fh.java.geometry.model.threedimensional.Cuboid;
import fh.java.geometry.model.threedimensional.Cylinder;
import fh.java.geometry.model.threedimensional.QuadraticPyramid;
import fh.java.geometry.model.threedimensional.ThreeDimensionalShape;
import fh.java.geometry.model.twodimensional.Circle;
import fh.java.geometry.model.twodimensional.RightTriangle;
import fh.java.geometry.model.twodimensional.Trapezoid;
import fh.java.geometry.model.twodimensional.TwoDimensionalShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Markus on 07.11.2016.
 */
public class Main {

    private List<TwoDimensionalShape> twoDimList;
    private  List<ThreeDimensionalShape> threeDimList;

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    public void doIt(){
        twoDimList = new ArrayList<>();
        fillTwoDimList();

        double areas = 0.0;
        double perimeters = 0.0;

        for(TwoDimensionalShape twoDimObject : twoDimList){
            areas = areas + twoDimObject.calcArea();
            perimeters = perimeters + twoDimObject.calcPerimeter();
        }
        System.out.println("Summed up areas: "+areas+"\nSummed up perimeters: "+perimeters);


       threeDimList = new ArrayList<>();
        fillThreeDimList();

        double volumes = 0.0;
        double surfaces = 0.0;

        for(ThreeDimensionalShape threeDimObject : threeDimList){
            volumes = volumes + threeDimObject.calcVolume();
            surfaces = surfaces + threeDimObject.calcSurface();
        }
        System.out.println("Summed up volumes: "+volumes+"\nSummed up surfaces: "+surfaces);


    }

    public void fillTwoDimList (){
        twoDimList.add(new Circle(2,2,5.0));
        twoDimList.add(new Circle(3,2,4.0));
        twoDimList.add(new Circle(4,2,3.0));
        twoDimList.add(new Circle(5,2,2.0));
        twoDimList.add(new RightTriangle(2,3,3.0,5.0));
        twoDimList.add(new RightTriangle(2,4,5.0,8.0));
        twoDimList.add(new RightTriangle(2,5,2.0,9.0));
        twoDimList.add(new Trapezoid(2,5,12.0,8.544,6.0,8.544,8.0));
    }

    public void fillThreeDimList (){
        threeDimList.add(new Cuboid(1,2,3));
        threeDimList.add(new Cuboid(2,3,4));
        threeDimList.add(new Cuboid(3,4,5));
        threeDimList.add(new Cuboid(4,5,6));
        threeDimList.add(new Cylinder(4,5,6.0,5.0));
        threeDimList.add(new Cylinder(3,2,4.0,7.0));
        threeDimList.add(new QuadraticPyramid(4,7.0));
        threeDimList.add(new QuadraticPyramid(3,4.0));
    }

}
