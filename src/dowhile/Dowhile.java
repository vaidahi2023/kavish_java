package dowhile;

/*
 * do 
 * {
 * 			//statement
 * 			//increment/decrement			
 * 
 * }while(condition);
 * 
 * fibonacci series 
 * 0 1 1 2 3 5 8 13 21 
 */
public class Dowhile {

	public static void main(String[] args) {
		
		int i,n=20;
		i=1;
		do 
		{
			System.out.println(i);
			i++;
		}while(i<=n);	
	}
}
