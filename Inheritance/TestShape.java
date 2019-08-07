class Shape{
	protected String color = "red";

	public Shape(){
		;
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
		
		Circle c[] = {new Circle(dim1,color),new Circle(),new Circle(dim1)};
		
		System.out.println("----------------------------------------------------");
		System.out.println("ENTER DETAILS OF RECTANGLE");
		System.out.print("Enter the length    : ");
		dim1 = input.nextFloat();
		System.out.print("Enter the width     : ");
		dim2 = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
		
		Rectangle r[] = {new Rectangle(dim1,dim2,color),new Rectangle(dim1),new Rectangle(),new Rectangle(dim1,dim2)};
		
		System.out.println("----------------------------------------------------");
		System.out.println("ENTER THE SQAURE DETAILS");
		System.out.print("Enter the side      : ");
		dim1 = input.nextFloat();
		input.nextLine();
		System.out.print("Enter the color     : ");
		color = input.nextLine();
		Square s[] = {new Square(dim1,color),new Square(),new Square(dim1)};
		Rectangle sq[] = s;
		
		System.out.println("----------------------------------------------------");
		System.out.println("CIRCLE DETAILS");
		for(int i = 0 ; i < c.length ; i++){
			System.out.println("Area of Circle       " + (i+1) + " : " + c[i].getArea());
			System.out.println("Perimeter of Circle  " + (i+1) + " : " + c[i].getPerimeter());
			System.out.println("Color of Circle      " + (i+1) + " : " + c[i].getColor());
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("RECTANGLE DETAILS");
		for(int i = 0 ; i < r.length ; i++){
			System.out.println("Area of Rectangle       " + (i+1) + " : " + r[i].getArea());
			System.out.println("Perimeter of Rectangle  " + (i+1) + " : " + r[i].getPerimeter());
			System.out.println("Color of Rectangle      " + (i+1) + " : " + r[i].getColor());
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("SQUARE DETAILS");
		for(int i = 0 ; i < s.length ; i++){
			System.out.println("Area of Sqaure       " + (i+1) + " : " + sq[i].getArea());
			System.out.println("Perimeter of Square  " + (i+1) + " : " + sq[i].getPerimeter());
			System.out.println("Color of Square      " + (i+1) + " : " + sq[i].getColor());
		}
		
	}
}
