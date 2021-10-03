import java.util.Scanner;
public class Validate {
	public static void main(String[] args)
	{
	  String username="Admin";
	  String password="Admin";
	  String user,pass;
	  Scanner ob=new Scanner(System.in);
	  System.out.println("Username:");
	  user=ob.nextLine();
	  System.out.println("password:");
	  pass=ob.nextLine();
	  if(username.equals(user))
	  {
		  if(password.equals(pass))
		  {
			  System.out.println("Login Successfully");
		  }
	  }
	  else
	  {
		  System.out.println("Login Denied");
	  }
	}
}
