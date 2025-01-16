package Matching_Project;
import java.util.Scanner;
public class Main {
   public static void main(String args[]) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Welcome to the Matching Contest \n");
	   String Country[]= {"America","South Africa","India","China","Germany"};
	   String Capitals[]= {"Washington DC","Cape Town","New Delhi","Beijing","Berlin"};
	   System.out.print(" Countries         ");
	   System.out.println("Capitals"+"\n");
	   int Score=0;
	   int k=Capitals.length-1;
	   char ch='a';
	   for(int i=0;i<Country.length;i++) {
	
		   System.out.print((i+1)+"."+Country[i]);
		   for(int j=0;j<=(15-Country[i].length()-1);j++) {
			   System.out.print(" ");
		   }
		   if(k>=0) {
		   System.out.println(ch+"."+Capitals[k]);
		   ch++;
		   k--;}
	   }
	   for(int i=0;i<Country.length-1;i++) {
	   System.out.println("Which Country You would like to answer ");
	   System.out.print("Choose the Country option in number : ");
	   int r1=scan.nextInt();
	  
	   char r2;
	   if(!(r1>=1&&r1<=5)) {
		   System.out.println("Invalid Choice");
	   }
	   else {
		   System.out.println("Enter the Capital of "+Country[r1-1]);
		   r2=scan.next().charAt(0);
		   switch(r1) {
		   case 1:
			     if(r2=='e') {
			    	 Score++;
			     }
			     break;
		   case 2:
			   if(r2=='d') {
				   Score++;
			   }
			   break;
		   case 3:
			   if(r2=='c') {
				   Score++;
			   }
			   break;
		   
	       case 4:
		   if(r2=='b') {
			   Score++;
		   }
		   break;
	       case 5:
		      if(r2=='a') {
			   Score++;
		   }
		   break;
		   
		   default:
			   System.out.println("Invalid option");
	   }
		   
   }
	   System.out.println("Would You like to Continue Y/N :");
	   char res=scan.next().charAt(0);
	   res= Character.toLowerCase(res);
	   if(res!='y') {System.out.println("Thank you");
	   break;
	   }
	   
	   }
	System.out.println("Your Final Score is "+Score);   
   }
}


