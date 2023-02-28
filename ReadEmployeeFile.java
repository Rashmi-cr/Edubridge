package assignment12;
import java.io.FileReader;
import java.io.IOException;
public class ReadEmployeeFile {
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
FileReader reader =new FileReader("Employee.txt");
int res=0;
do {
res=reader.read();
System.out.print((char)res+" ");
}while(res!=-1);
}
}