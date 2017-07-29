package homework;

import java.util.Scanner;

public class UserLogin extends FormRegistration
{
	public String uname="",pswrd="";
   	
	  public void login_form()
	  {
       javax.swing.JOptionPane.showMessageDialog(null,"Login Form");
	    uname=javax.swing.JOptionPane.showInputDialog("Enter Username");
	    pswrd=javax.swing.JOptionPane.showInputDialog("Enter password");
	  }
	      public void check()
	       {
		      if(uname.equals(username) && pswrd.equals(password)) System.out.println("your login is successful");
			         		       
		      else  System.out.println("your password or user name is incorrect\n pls enter the correct username and password");
           }
	
	
	
	public static void main(String [] args)

	{
		int ch;		
		UserLogin login_form=new UserLogin();
		do
		{
		   login_form.register();
         login_form.login_form();
		   login_form.check();
	      login_form.display();
		   ch = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Want to continue 1.yes 2.no?"));
      } while (ch == 1);
   }
}