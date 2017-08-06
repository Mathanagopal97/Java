import java.util.Scanner;

public class BubbleSort{  
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];  
        System.out.println("Enter"+n+" Numbers");
        for(int i=0; i < n; i++)
        {  
            a[i] = sc.nextInt();    
        }  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
         for(int j=1; j < (n-i); j++)
         {
         if(a[j-1] > a[j])
         {  
            temp = a[j-1];  
            a[j-1] = a[j];  
            a[j] = temp;  
         }  
                          
         }  
         }
         System.out.println("After Sorting");
         for(int k:a){ System.out.println(k);}
         
         }
         }