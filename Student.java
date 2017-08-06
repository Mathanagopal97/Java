import java.util.Scanner;

public class Student{  
    public static void main(String [] args){
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Total Number Of Students");
      n = sc.nextInt();
      String name[] = new String[n];
      double mark1[] = new double[n];
      double avg[] = new double[n];
      double mark2[] = new double[n];
      String result;
      for(int i=0;i<n;i++){
     // System.out.println("Enter name of "+i+1+" student");
      name[i] = javax.swing.JOptionPane.showInputDialog("Enter Name Of "+(i+1)+" Student");
      System.out.println("Enter Mark1");
      mark1[i] = sc.nextDouble();
      System.out.println("Enter Mark2");
      mark2[i] = sc.nextDouble();
      avg[i] = (mark1[i]+mark2[i])/2.0;
      }
      for(int i=0;i<n;i++){
      System.out.println("Name: "+name[i]);
      System.out.println("Mark1: "+mark1[i]);
      System.out.println("Mark2: "+mark2[i]);  
      System.out.println("Average: "+avg[i]); 
      if(avg[i]>=60) result = "Pass";
      else result = "Fail";
      System.out.println("Result: "+result);  
      System.out.println("\n--------------------------------\n");
      }
  }
}

      
      
      

      
      
