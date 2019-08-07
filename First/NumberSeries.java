public class NumberSeries{
	
	public static void main(String[] args){
		for(int i = 1 ; i <= 110 ; i++){
			if(i % 3 == 0){
				System.out.print("Coza");
				
				if(i % 5 == 0){
					System.out.print("Loza ");
				}
				else if(i % 7 == 0){
					System.out.print("Woza ");
				}
				else{
					System.out.print(" ");
				}
			}
		

			else if(i % 5 == 0){
				System.out.print("Loza");
				
				if(i % 7 == 0){
					System.out.print("Woza ");
				}
				else{
					System.out.print(" ");
				}
			}
		
			else if(i % 7 == 0){
				System.out.print("Woza ");
			}
			
			else{
				System.out.print(i + " ");
 			}
			if(i % 11 == 0){
				System.out.println();
			}
		}
	}
}
