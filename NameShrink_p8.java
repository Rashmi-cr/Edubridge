package assignment8;

import java.util.Scanner;
import java.util.StringTokenizer;
public class NameShrink_p8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    getvalues(s1);
  }
  public static void getvalues(String s1) {
    StringBuffer sb = new StringBuffer();
    StringTokenizer st = new StringTokenizer(s1, " ");
    String s2 = st.nextToken();
    String s3 = st.nextToken();
    String s4 = st.nextToken();
    sb.append(s4).append(" ");
    sb.append(s3.substring(0, 1));
    sb.append(".");
    sb.append(s2.substring(0, 1));
    System.out.println(sb);
  }
}