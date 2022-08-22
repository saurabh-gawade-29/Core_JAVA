package Lecture18;


class Rectangle implements Area
{
    public double Compute(double l, double b)
    {
        return (l*b);
    }
    public double Perimeter(double l, double b){
        return (l*b*2);
    }
}

 class Triangle implements Area
{
    public double Compute(double b, double h)
    {
        return (b*h/2);
    }
}

public class MainArea
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        double RArea = rect.Compute(10, 20);
        System.out.println("The area of the Rectangle is "+RArea);

        Triangle tri = new Triangle();
        double TArea = tri.Compute(10, 20);
        System.out.println("The area of the triangle is "+TArea);

    }
}
