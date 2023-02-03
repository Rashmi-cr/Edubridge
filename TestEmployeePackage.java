package assignment7employee;

import assignment7department.Department;

//Department and Project class
public class TestEmployeePackage {
public static void main(String[] args) {
 /* Employee employee = new Employee();
 employee.displayEmployee();
 
 Manager manager = new Manager();
 manager.displayManager();
 System.out.println();*/
 
 Admin admin = new Admin();
 admin.displayAdmin();
 System.out.println();
 
 Department department = new Department();
 department.displayDepartment();
}
}