package assignment7department;
class Project { /*class Project is made default class to restrict its accessibility outside the class,
it's properties can be accessed outside the package only through the class Department.*/
private String projectName1 = "A";
private String projectName2 = "B";
private String projectName3 = "C";
public void displayProject() {
 System.out.println("\nProject list");
 System.out.println(projectName1);
 System.out.println(projectName2);
 System.out.println(projectName3);
}
}
