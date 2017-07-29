package homework;
public class FormRegistration
{
	public String firstname,lastname,password,username;
	int age;
	
	public void register()
	{
	   
	    firstname = javax.swing.JOptionPane.showInputDialog("Enter first name");
        
		 lastname = javax.swing.JOptionPane.showInputDialog("Enter last name");
       
		 age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter age"));
       
		 username = javax.swing.JOptionPane.showInputDialog("Enter user name");
       
		 password = javax.swing.JOptionPane.showInputDialog("Enter password");
       
	 javax.swing.JOptionPane.showMessageDialog(null,"\n Your registration is successfully completed. Now you will be directed to Login Form to vies details");
    }
	
	public void display()
	{
	javax.swing.JOptionPane.showMessageDialog(null,"Your details are:"+"\n First name:"+firstname+
	    "\n Last Name:"+lastname+"\n Age:"+age+"\n Username:"+username+ "\n Password:"+password);
	
	
	}

	
}