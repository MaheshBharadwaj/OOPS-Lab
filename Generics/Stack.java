class Stack<T>
{
	int top;
	T a[];
	int capacity;
	Stack(int n){
		top = -1;
		capacity = n;	
		a = new T[capacity];
	}
	
	int isEmpty(){
		return top == -1;
	}
	
	int isFull(){
		return top == capacity - 1;
	}
	
	void push(T x){
		if(isFull())
			System.out.println("Stack full!");
		else
			a[++top]=x;

	}
	T pop(){
		if(isEmpty())
			System.out.println("Stack Empty!");
		else{
			T tmp = a[top--];
			return tmp;
		}
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
