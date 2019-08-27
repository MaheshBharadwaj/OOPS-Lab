interface Shape{
	public String color = "red";
	//public String getColor();
 	//public void setColor(String color);
 	public float getArea();
 	public float getPerimeter();
}


class Circle implements Shape{
	protected float radius;

	public Circle(){
		radius = 1.0f;
	}

	public Circle(float radius){
		this.radius = radius;
	}
	/*
	public Circle(float radius,String color){
		color
		this.radius = radius;
	}
	*/
	public float getRadius(){
		return radius;
	}

	public void setRadius(float radius){
		this.radius = radius;
	}

	public float getArea(){
		return 3.14f * radius * radius;
	}

	public float getPerimeter(){
		return 2 * 3.14f * radius;
	}
}

class Rectangle implements Shape{
	protected float width;
	protected float length;

	public Rectangle(){
		length = width = 1.0f;
	}

	public Rectangle(float width,float length){
		this.width = width;
		this.length = length;
	}
	/*
	public Rectangle(float width,float length,String color){
		super(color);
		this.width = width;
		this.length = length;
	}
	*/
	public float getWidth(){
		return width;
	}

	public float getLength(){
		return 	length;
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
		return 2 * ( length + width);
	}

}

class Square extends Rectangle{
	public Square(){
		super();
	}

	public Square(float side){
		super(side,side);
	}
	/*
	public Square(float side,String color){
		super(side,side,color);
	}
	*/
	public float getSide(){
		return getLength();
	}

	public void setSide(float side){
		setLength(side);
		setWidth(side);
	}

	public float getArea(){
		return super.getArea();
	}

	public float getPerimeter(){
		return super.getPerimeter();
	}
}

class TestShapeInterface{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);

		float length,width,side,radius;


		System.out.print("Enter the radius of the circle: ");
		radius = input.nextFloat();
	

	}
}




