class Shape{
	protected String color = "Red";

	public Shape(){
		color = "Red";
	}

	public Shape(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public  void setColor(String color){
		this.color = color;
	}

}

class Circle extends Shape{
	protected float radius = 1.0f;

	public Circle(){
		radius = 1.0f;
	}

	public Circle(float radius){
		this.radius = radius;
	}

	public Circle(float radius,String color){
		super(color);
		this.radius = radius;
	}

	public float getRadius(){
		return radius;
	}

	public void setRadius(float radius){
		this.radius = radius;
	}

	public float getArea(){
		return (float)3.14 * radius * radius;
	}

	public float getPerimeter(){
		return (float)2 * (float)3.14 * radius;
	}

}

class Rectangle extends Shape{
	protected float length =  1.0f;
	protected float width =  1.0f;

	public  Rectangle(){
		length = width = 1.0f;
	}	

	public Rectangle(float width){
		this.width = width;
	}
	public Rectangle(float width,float length){
		this.length = length;
		this.width  = width;
	}

	public Rectangle(float width,float length,String color){
		super(color);
		this.length = length;
		this.width  = width;
	}

	public float getWidth(){
		return width;
	}

	public float getLength(){
		return length;
	}

	public void setWidth(float width){
		this.width = width;
	}

	public void setLength(float length){
		this.length = length;
	}

	public float getArea(){
		return length * width;
	}

	public float getPerimeter(){
		return 2 * (length + width);
	}

}

class Square extends Rectangle{
	public Square(){
		super();
	}

	public Square(float side){
		super(side,side);
	}

	public Square(float side,String color){
		super(side,side,color);
	}

	public float getSide(){
		return length;
	}

	public void setSide(float side){
		setLength(side);
		setWidth(side);
	}

}

class TestShape{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String color;
		float dim1,dim2;
		
		System.out.println("ENTER DETAILS OF CIRCLE");
		System.out.print("Enter the radius    : ");
		dim1 = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
		Circle c[] = {new Circle(),new Circle(dim1),new Circle(dim1,color)};
		

		System.out.println("\nENTER DETAILS OF RECTANGLE");
		System.out.print("Enter the length    : ");
		dim1 = input.nextFloat();
		System.out.print("Enter the width     : ");
		dim2 = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
		Rectangle r[] = {new Rectangle(),new Rectangle(dim1),new Rectangle(dim1,dim2),new Rectangle(dim1,dim2,color)};

		System.out.println("\nENTER DETAILS OF SQUARE");
		System.out.print("Enter the side      : ");
		dim1 = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
		Square s[] = {new Square(),new Square(dim1),new Square(dim1,color)};
		Rectangle sq[] = s;

		System.out.println("\n*********************************************************************\n");


		System.out.println("CIRCLE DETAILS\n");
		System.out.println("Circle with default constructor Circle():");
		System.out.println("Area      = " + c[0].getArea());
		System.out.println("Perimeter = " + c[0].getPerimeter());
		System.out.println("Color     = " + c[0].getColor());
		System.out.println("\n---------------------------------------------------------------------\n");

		System.out.println("Circle With 1 parameter constructor Circle(radius)");
		System.out.println("Area      = " + c[1].getArea());
		System.out.println("Perimeter = " + c[1].getPerimeter());
		System.out.println("Color     = " + c[1].getColor());	

		System.out.println("\n---------------------------------------------------------------------\n");
		
		System.out.println("Circle with 2 parameter constructor Circle(radius,color):");
		System.out.println("Area      = " + c[2].getArea());
		System.out.println("Perimeter = " + c[2].getPerimeter());
		System.out.println("Color     = " + c[2].getColor());	

		System.out.println("\n*********************************************************************\n");

		System.out.println("RECTANGLE DETAILS\n");
		System.out.println("Rectangle with default constructor Rectangle():");
		System.out.println("Area      = " + r[0].getArea());
		System.out.println("Perimeter = " + r[0].getPerimeter());
		System.out.println("Color     = " + r[0].getColor());
		System.out.println("\n---------------------------------------------------------------------\n");

		System.out.println("Rectangle With 1 parameter constructor Rectangle(width)");
		System.out.println("Area      = " + r[1].getArea());
		System.out.println("Perimeter = " + r[1].getPerimeter());
		System.out.println("Color     = " + r[1].getColor());	

		System.out.println("\n---------------------------------------------------------------------\n");
		
		System.out.println("Rectangle with 2 parameter constructor Rectangle(width,length):");
		System.out.println("Area      = " + r[2].getArea());
		System.out.println("Perimeter = " + r[2].getPerimeter());
		System.out.println("Color     = " + r[2].getColor());	

		System.out.println("\n---------------------------------------------------------------------\n");

		System.out.println("Rectangle with 3 parameter constructor Rectangle(width,length,color)");
		System.out.println("Area      = " + r[3].getArea());
		System.out.println("Perimeter = " + r[3].getPerimeter());
		System.out.println("Color     = " + r[3].getColor());	

		System.out.println("\n*********************************************************************\n");
		
		System.out.println("SQUARE DETAILS\n");
		System.out.println("Square with default constructor Square():");
		System.out.println("Area      = " + sq[0].getArea());
		System.out.println("Perimeter = " + sq[0].getPerimeter());
		System.out.println("Color     = " + sq[0].getColor());
		System.out.println("\n---------------------------------------------------------------------\n");

		System.out.println("Square With 1 parameter constructor Square(side)");
		System.out.println("Area      = " + sq[1].getArea());
		System.out.println("Perimeter = " + sq[1].getPerimeter());
		System.out.println("Color     = " + sq[1].getColor());	

		System.out.println("\n---------------------------------------------------------------------\n");
		
		System.out.println("Square with 2 parameter constructor Square(side,color):");
		System.out.println("Area      = " + sq[2].getArea());
		System.out.println("Perimeter = " + sq[2].getPerimeter());
		System.out.println("Color     = " + sq[2].getColor());	

	}
}
