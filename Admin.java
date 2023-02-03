package assignment7employee;
 /*created a Admin class as a public class and can be accessible outside the package too,the 
properties of class Employee and Manager can be accessed only through the class Admin.*/
public class Admin {
private String adminName = "Kushi";
private String adminId = "A101";
public void displayAdmin() {
 System.out.println("\nAdmin details");
 System.out.println(adminName);
 System.out.println(adminId);
 Manager manager = new Manager();
 manager.displayManager();
 Employee employee = new Employee();
 employee.displayEmployee();
}
}