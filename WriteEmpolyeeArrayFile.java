package assignment12;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteEmpolyeeArrayFile {
public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
FileInputStream fileInputStream=new FileInputStream("Employee.txt");
byte[] array=new byte[20];
fileInputStream.read(array);
for(byte b:array)
{
System.out.print((char)b);
}
fileInputStream.close();
}
}