
package member;
import java.util.Scanner;
public class Driver {

    
    public static void main(String[] args) {
         Scanner in =new Scanner(System.in);
       System.out.println("Enter specialization of employee: ");
      String sp=in.nextLine();
       System.out.println("Enter department of employee: ");
      String de= in.nextLine();
        System.out.println("Enter name of employee: ");
      String n= in.nextLine();
      System.out.println("Enter age of employee: ");
      int a=in.nextInt();
       System.out.println("Enter address of employee: ");
      String ad=in.nextLine();
      System.out.println("Enter Phone number of employee: ");
      int p=in.nextInt();
      System.out.println("Enter salary of employee: ");
      double s= in.nextDouble();
      
      
         System.out.println("Enter specialization of manager: ");
      String spm=in.nextLine();
       System.out.println("Enter department of manager: ");
      String dem= in.nextLine();
        System.out.println("Enter name of manager: ");
      String nm= in.nextLine();
       System.out.println("Enter address of manager: ");
      String adm=in.nextLine();
       System.out.println("Enter age of manager: ");
      int am=in.nextInt();
       System.out.println("Enter Phone number of manager: ");
      int pm=in.nextInt();
       System.out.println("Enter salary of manager: ");
      double sm= in.nextDouble();
      
      
       Employee a1= new Employee(n,a,p,ad,s,sp,de);
       
        System.out.println(a1);
       a1.print_salary();
      
      
       
      
        Manager a2= new Manager(nm,am,pm,adm,sm,spm,dem);
        System.out.println(a2);
         
         
 
        a2.print_salary();
       

    }
    
}
