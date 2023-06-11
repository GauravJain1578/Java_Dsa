import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
				/*for(int i=0;i<10;i++) {
					System.out.println("hello");
				}*/
		//int i=0;
		/*while(i<10) {
			//System.out.println(i);
			i++;
		}*/
		/*System.out.print("Enter the value:");
		Scanner scan =  new Scanner(System.in);
		int value= scan.nextInt();
		
		do {
			System.out.println(value);
			value++;
		} while(value>=1);*/
		
		
		
		
		
		
		// this pattern is for  square filled with star from inside
		/*int i=0;
		int j=0;
		int n=12;
		
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++) {
				 
				 System.out.print("*");
				 }
			 System.out.println();
				}*/
		
		
		
		
		//this pattern is for  hollow square 
		/*int i=0;
		int j=0;
		
		int n=4;
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {	
				if(i==0 || i==n) {
					System.out.print("*");
				}
				else {
					if (j==0 || j==n){
						System.out.print("*");
						}
					else{
						System.out.print("");
						}
				}
			}
			System.out.println();
		
		 }*/
		
		
		
		
		//this pattern is for H
		/*int i=0;
		int j=0;
		int n=4;
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {	
				
				if(i==n/2) {
					System.out.print("*");
				}
				else {
					if (j==0 || j==n){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
						}
				}
					
			}
			System.out.println();		
		}*/
		
		
		
		
		// this pattern is A
		/*int i=0;
		int j=0;
		
		int n=5;
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {
				if(i==0) { 
					if(j==0 || j==n) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
						}
				}
				else if(i==n/2) {
					System.out.print("*");
				}
				else {
					if (j==0 || j==n){
						System.out.print("*");
						}
					else{
						System.out.print(" ");
						}
				}
					
			}
			System.out.println();		
		}*/
		
		
		
		
		// this pattern is for D
		/*int i=0;
		int j=0;
		
		int n=5;
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {
				if(i==0) { 
					if(j==0 || j==n) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
						}
				}
				else if (i==n) {
					if(j==0 || j==n) {
					System.out.print(" ");
					}
				else {
					System.out.print("*");
				}
			}
				else {
				if (j==0 || j==n){
						System.out.print("*");
						}
				else{
						System.out.print(" ");
					}
			
				}
			}
					
			
			System.out.println();		
		}*/
		
		
		/*int i=0;
		int j=0;
		
		int n=10;
		
		
		for(i=0;i<=n;i++) {
			
			
			for(j=0;j<=n;j++) {
				
				if( i>(n/2)) {
					
					if(j==(i/5)+1|| j==n-(i/5)-1) {
					
							System.out.print("*");
						
					}
					/*else {
						System.out.print(" ");
					}*/
				}
				else if(j==(n/2)-i || j==(n/2)+i) {
					System.out.print("*");
				}
				else if(i==0 || i== n) {//
					System.out.print("*");
				}
				else if(j==0 || j==n) {//
					System.out.print("*");
				}
				
				else if(j==n/2 && i==n/2) {
					System.out.print("*");
				}
				else  if(j== i || j==n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		}
			System.out.print(" ");
			for(j=0;j<=n;j++) {
				if(i==0 || i== n) {//
					System.out.print("*");
				}
				else if(j==0 || j==n) {//
					System.out.print("*");
				}
				
				else if(j==n/2 && i==n/2) {
					System.out.print("*");
				}
				else  if(j== i || j==n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		}
			System.out.println();
			
			
		
		
		
		
		
		
		
		
		
		
		
		}*/


		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

