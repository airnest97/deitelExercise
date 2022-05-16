package chapter8;

public class CylinderClass {
    private double radius = 1;
    private double height = 1;


    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException();
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException();
    }

    public double getRadius() {
        return radius;
    }


    public void volumeOfCylinder(){
        double volumeOfCylinder = (Math.PI * Math.pow(radius, 2) * height);
        System.out.printf("The volume of the cylinder is: %.2f", volumeOfCylinder);
    }
}
