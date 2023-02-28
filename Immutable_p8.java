package assignment10;

public class Immutable_p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s1 = "JAVA";
 
        String s2 = "JAVA";
 
        System.out.println(s1 == s2);
        //Output : true
        System.out.println("s1 and s2 are equal");
        s1 = s1 + "course";
 
        System.out.println(s1 == s2);         //Output : false
        System.out.println("s1 and s2 are not equal");
    }



	}


