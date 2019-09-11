class Stack<T>{
	int top;
	T a[];
	int capacity;
	
	Stack(int n,T arr[]){
		top = -1;
		capacity = n;	
		a = arr;
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == capacity - 1;
	}
	
	void push(T x){
		if(isFull())
			System.out.println("Stack full!");
		else
			a[++top]=x;
	}

	T pop(){
		if(isEmpty()){
			System.out.println("Stack Empty!");

		}
	
		return a[top--];
	}

	void display(){
		int i;
		if(isEmpty())
			System.out.println("Stack Empty!");
			
		System.out.println("\nThe Elements are :");
		for(i=top;i>=0;i--)
			System.out.println(a[i] + " ");
	}		
}


class TestStack{
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
	
		int opt = 0;
		int ch = 0;
		
		while(opt != 4){
			System.out.println("1 - Integer Stack");
			System.out.println("2 - Double Stack");
			System.out.println("3 - String Stack");
			System.out.println("4 - Exit");
			System.out.print("Enter your choice: ");
			opt = input.nextInt();
			
			switch(opt){
				case 1: {
							int temp;
							Integer arr[] = new Integer[10];
							Stack<Integer> intStack = new Stack<Integer>(10,arr);
					
							while(ch != 4){
								System.out.println("1 - Push");
								System.out.println("2 - Pop");
								System.out.println("3 - Display");
								System.out.println("4 - Back");
								System.out.println("Enter your choice: ");
								ch = input.nextInt();
						
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.nextInt();
											 intStack.push(temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 2: {
											 temp = intStack.pop();
											 System.out.println("Value Popped: " + temp);
											 System.out.println("----------------------------");
											}
											 break;
									case 3: {
												intStack.display();
												System.out.println("----------------------------");
											}
											break;
											
								}
							}
						}
						break;
				case 2: {
							double temp;
							Double arr[] = new Double[10];
							Stack<Double> dStack = new Stack<Double>(10,arr);
					
							while(ch != 4){
								System.out.println("1 - Push");
								System.out.println("2 - Pop");
								System.out.println("3 - Display");
								System.out.println("4 - Back");
								System.out.println("Enter your choice: ");
								ch = input.nextInt();
						
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.nextDouble();
											 dStack.push(temp);
											 System.out.println("----------------------------");
											}
											break;
									case 2: {
											 temp = dStack.pop();
											 System.out.println("Value Popped: " + temp);
											 System.out.println("----------------------------");
											}
											break;
									case 3: {
												dStack.display();
												System.out.println("----------------------------");
											}
											break;
											
								}
							}
						}
						break;
				case 3: {
							String temp;
							String arr[] = new String[10];
							Stack<String> sStack = new Stack<String>(10,arr);
					
							while(ch != 4){
								System.out.println("1 - Push");
								System.out.println("2 - Pop");
								System.out.println("3 - Display");
								System.out.println("4 - Back");
								System.out.println("Enter your choice: ");
								ch = input.nextInt();
						
								switch(ch){
									case 1: {
											 System.out.print("Enter the value to push: ");
											 temp = input.next();
											 sStack.push(temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 2: {
											 temp = sStack.pop();
											 System.out.println("String Popped: " + temp);
											 System.out.println("----------------------------");
											 }
											 break;
									case 3: {
												sStack.display();
												System.out.println("----------------------------");
											}
											break;
											
								}
							}
						}
						break;
			}
		}
	}
}
			
