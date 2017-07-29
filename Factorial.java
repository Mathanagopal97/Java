public class Factorial
{
   public static void main(String [] args)
      {
         int n,answer = 1;
         n = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter An Number"));
         while(n>0)
         {
            answer = answer*n;
            n--;
         }
         javax.swing.JOptionPane.showMessageDialog(null,"Factorial  = "+answer);
      }
}
      
