package assignment9;
public class EvenOdd_p2{
	public static void main(String[]args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if ((arr[i] + arr[j]) % 2 == 0) {
		            System.out.println( arr[i] + "+" + arr[j] + "=even");
		        } else {
		            System.out.println( arr[i] + "+" + arr[j] + "=odd");
		        }
		    }
		}
	}
	}
	