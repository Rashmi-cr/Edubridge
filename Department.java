package assignment7department;// created package departmentpackage.
public class Department { // class Department is made public so that it can be accessed outside the
//package
private String departmentName1="Developing";
private String departmentName2="Testing";
public void displayDepartment() {
 System.out.println("\nDepartment list");
 System.out.println(departmentName1);
 System.out.println(departmentName2);
 Project project=new Project();
 project.displayProject();
}
}
