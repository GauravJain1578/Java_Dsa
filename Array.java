import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*int nums[]= {1,2,3,4};
		nums[5]=5;
		System.out.println(nums[1]);
		for(int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		/*int nums[] =null ;
	    nums[0]=5;*/
		
		int num[][]=new int[3][3];
		//num[3][3]=9;
		Scanner scan= new Scanner(System.in);
		int number ;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				number=scan.nextInt();
				num[i][j]=number;
				
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
		
	    

	}

}
