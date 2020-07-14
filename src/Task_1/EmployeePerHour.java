package Task_1;

public class EmployeePerHour implements Salary{

	@Override
	public void salary() {
		int payment = 10;		
		int hoursPerDay = 8;
		int daysPerMonth= 22;
		System.out.println("The salary of employee ¹1 is " + payment * hoursPerDay * daysPerMonth + " dollars.");
		
	}

}
