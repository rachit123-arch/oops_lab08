package labsheet08.question03;

public class Question03EmployeeBean {
    public static void main(String[] args) {
        EmployeeBean employee = new EmployeeBean();
        employee.setEmpId(12);
        employee.setEmpName("Neha");
        employee.setSalary(55000);

        System.out.println(employee.getEmpId() + ", " + employee.getEmpName() + ", " + employee.getSalary());
    }
}
