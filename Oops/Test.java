package Oops;
class Employee {
	int empId=2;
	int basicSalary=20000;
	int incentive=200;
	
	
	void countSalaries() {
		System.out.println(basicSalary+incentive);
	}
	int getbasicSalary() {
		return basicSalary;
		
	}
	int setbasicSalary(int basicSalary) {
		this.basicSalary=basicSalary;
		return basicSalary;
	}
	//void Employee() {
		
	//}
	 private Employee(int empId,int basicSalary,int incentive) {
		this.empId=empId;
		this.basicSalary=basicSalary;
		this.incentive=incentive;
	}
	private Employee() {
		
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee(123, 1230, 300);
		Employee e2=new Employee(123,3458,345);
		Employee e3=new Employee();
		Employee e4= new Employee();
		

	}
	

}
