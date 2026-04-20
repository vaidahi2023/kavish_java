package Exception;

public class Exception1 {

	public static void main(String[] args) {
		
		
		try 
		{
			int a[]=new int[5];
			a[10]=90;
			
		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block");
		}
	}
}
