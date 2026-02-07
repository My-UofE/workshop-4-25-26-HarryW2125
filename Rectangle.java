// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

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
  // set and get methods for attributes 
  public double getWidth(){
    return this.width;
  }

  public void setWidth(double width){
    if (width >= 0) {
      this.width = width;
    }
  }

    public double getHeight(){
    return this.height;
  }

  public void setHeight(double height){
    if (height >= 0) {
      this.height = height;
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

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  //method: scales rectangle by x,y individually
  public void scale(double scaleX, double scaleY) {
    ///this.width * scaleX;
    ///this.height = this.height * scaleY;
  }

  public void scale(double scale) {
    this.setWidth(this.getWidth() * scale);
    this.setHeight(this.getHeight() * scale);
  }

  // method: isOverlappedWith 
  public boolean isOverlappedWith(Rectangle r) {
    // Get the bounds of this rectangle
    double thisLeft = this.originX;
    double thisRight = this.originX + this.width;
    double thisBottom = this.originY;
    double thisTop = this.originY + this.height;
    
    // Get the bounds of the other rectangle
    double otherLeft = r.originX;
    double otherRight = r.originX + r.width;
    double otherBottom = r.originY;
    double otherTop = r.originY + r.height;
    
    // Check if rectangles overlap
    // They overlap if they intersect in both x and y dimensions
    boolean xOverlap = thisLeft < otherRight && thisRight > otherLeft;
    boolean yOverlap = thisBottom < otherTop && thisTop > otherBottom;
    
    return xOverlap && yOverlap;

  }

  // static method belongs to the class
  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }
  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public double calcRatio() {
    return width/height;
  }

  public boolean isSquare() {
     return height == width || width - height <= 0.001 || height - width <= 0.001;
  }
  
}
