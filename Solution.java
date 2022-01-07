import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try
	    {
			InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader y = new BufferedReader(in);
            int n = Integer.parseInt(y.readLine());
            while(n != 42)
            {
                System.out.println(n);
                n = Integer.parseInt(y.readLine());
            }
		}
		catch(Exception e)
		{
			return;
		}
		
        
	}
}
