package Exception;

import java.io.FileReader;
import java.io.IOException;

public class Exception3 {

	public static void readfile() throws IOException
	{
		FileReader f=new FileReader("test.txt");
		System.out.println("file is created");
	}
	public static void main(String[] args) {
		
		try
		{
			readfile();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("file is not present"
					+ "");
		}
		
	}
}
