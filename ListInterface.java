package assignment12;
import java.util.ArrayList;
import java.util.List;
public class ListInterface {
public static void main(String[] args) {
// TODO Auto-generated method stub
List<Integer> intList = new ArrayList<Integer>();
intList .add(1);
intList .add(2);
intList .add(3);
System.out.println(intList );
List<Float> floatList = new ArrayList<>();
floatList.add(1.23f);
floatList.add(2.356f);
System.out.println(floatList );
List<Short> shortList = new ArrayList<>();
shortList.add((short) 1);
shortList.add((short) 1);
System.out.println(shortList );
List<String> stringList = new ArrayList<>();
stringList.add("Rashmi");
stringList.add("C R");
System.out.println(stringList );
}
}