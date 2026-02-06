// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // 1st constructor
  public Rectangle(double width, double height) {
    this(width,height,0,0);
  }

  public Rectangle() {
    this(1,1,0,0);

  }
  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  //method: scales rectangle by x,y individually
  public void scale(double scaleX, double scaleY) {
    this.width = this.width * scaleX;
    this.height = this.height * scaleY;
  }

  public void scale(double scale) {
    this.width = this.width * scale;
    this.height = this.height * scale;
  }

  // method: isOverlappedWith 
  public boolean isOverlappedWith(Rectangle r) {
    

  }
  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
}
