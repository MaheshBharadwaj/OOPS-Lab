public class Student{
	
	public static void main(String[] args){
		if(args.length != 7){
			System.out.println("Error in input!");
			return;
		}
		
		int marks[] = new int[5];
		int sum = 0;
		
		for(int i = 0,j = 2 ; i < 5 ; i++,j++){
			marks[i] = Integer.parseInt(args[j]);
			sum += marks[i];
		}

		System.out.println("The average of " + args[0] + " is: " + (sum/5.0));
	}
}
