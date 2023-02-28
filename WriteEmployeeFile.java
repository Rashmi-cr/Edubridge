package assignment12;
import java.io.FileWriter;
import java.io.IOException;
public class WriteEmployeeFile {
public static void main(String[] args) {
// TODO Auto-generated method stub
try {
FileWriter fileWriter=new FileWriter("Employee.txt");
fileWriter.write("Hello world");
fileWriter.close();
}catch(IOException ex)
{
System.out.println("---->"+ex.getMessage());
}
}
}