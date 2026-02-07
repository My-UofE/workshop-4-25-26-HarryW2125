public class CircleApp{

public static void main(String[] args) {
    Circle c1 = new Circle(5.6,2.3,7.8);
    Circle c2 = new Circle(3.4);
    Circle c3 = new Circle();
    System.out.println("circle 1 radius " + c1.getRadius());
    c1.setRadius(3.8);
    System.out.println("circle 1 radius " + c1.getRadius());
}


}