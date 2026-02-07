// circle class

public class Circle{
    //attributes
    private double radius;
    private double originX = 0.0;
    private double originY = 0.0;

    //main constructor
    public Circle(double radius, double originX, double originY) {
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    //only takes radius
    public Circle(double radius) {
        this.radius = radius;
    }

    //takes no arguements
    public Circle() {
        this.radius = 1;
    }

    //methods
    //get and set
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if ( radius >=0 ) {
            this.radius = radius;
        }
    }

    public double getOriginX(){
    return this.originX;
  }

    public void setOriginX(double originX){
    this.originX = originX;
  }

    public double getOriginY(){
    return this.originY;
  }

    public void setOriginY(double originY){
    this.originY = originY;
  }

  //non get and set methods
  public double getArea() {
    return (this.radius*this.radius) * 3.14;
  }

  public double getCircumference() {
    return (this.radius + this.radius) * 3.14;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  public String toString(){
  return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
  }
}