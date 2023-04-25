package variable;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setEmpId(101);
		employee.setEmpId(102);
		employee.setEmpId(103);
		employee.setEmpSalary(10000);
		
		employee.setEmpName("rashmi");
		employee.setEmpMobileNo(583931122);
		employee.setEmpAddress("hubli");
		
	 System.out.println("EMPLOYEE DETAILS :"+employee.getEmpId()+"\n "
	 +employee.getEmpSalary()+"\n"+employee.getEmpName()+" \n"+employee.getEmpMobileNo()+"\n "+employee.getEmpAddress());
		
	}

	

}
