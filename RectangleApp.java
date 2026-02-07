// An application to create and manipulate rectangles
public class RectangleApp {
	//To be excutable, need a main method
	public static void main( String[] args ) {
		System.out.println("Creating myRect1");
		
		Rectangle myRect1; //myRect is not instantiated
		myRect1 = new Rectangle(20.0, 8.0,30,30); //instantiated
		
		//static field
		System.out.println("Rectangle has " + Rectangle.NUMBER_OF_SIDES + " sides");
		//instance fields
		System.out.println("Width: "+myRect1.getWidth()+", Height: "+myRect1.getHeight());
		System.out.println("Origin is: "+myRect1.getOriginX()+","+myRect1.getOriginY());
		//calling methods
		System.out.println("Area: "+myRect1.getArea());
		
		System.out.println("\nMoving myRect1");
		myRect1.move(0,10);//the object's state is changed
		System.out.println("Origin is: "+myRect1.getOriginX()+","+myRect1.getOriginY());

		System.out.println("Changing width of myRect1");
		myRect1.setWidth(16);//the object's state is changed
		System.out.println("Width: "+myRect1.getWidth()+", Height: "+myRect1.getHeight());

		System.out.println("Check class prevents negative widths");

		// initialise rectangle for test
		Rectangle myRect7 = new Rectangle(30.0, 5.0, 10, 10); 
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to positive width should be allowed
		myRect7.setWidth(40);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

		// change to negative width should be ignored
		myRect7.setWidth(-10);
		System.out.println( "Width: "+myRect7.getWidth()+", Height: "+myRect7.getHeight() );

}}
