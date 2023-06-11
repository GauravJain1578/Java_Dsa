//import java.awt.print.Printable;
import java.util.Scanner;

//import javax.management.ObjectName;

class Fcfs {
	int at=0;
	int bt=0;
	int ct=0;
	int rt=0;
	int processNo;
	
	
}
public class Program {

	public static void main(String[] args) {
		int n;
		int temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no of Process:");
		n=sc.nextInt();
		System.out.println();
		
		
		Fcfs Processes []=new Fcfs[n];
		System.out.println("Enter the details of the processes");
		
		for(int i=0;i<n;i++) {
//			System.out.print("Enter the process No:");
//			Processes[i].processNo=sc.nextInt();
//			System.out.println();
			System.out.print("Enter the Arrival Time :");
			temp=sc.nextInt();
			Processes[i].at=temp;
			System.out.println();
			
		}
		
		

	}

}
