package totalsumavg;
import java.util.Scanner;
public class TotalArray {

	     public static void main(String[] args) {
	           Scanner sc = new Scanner(System.in);

	           int sum = 0;
	           int arr[] = new int[5];
	           String str[] = { "국어", "수학", "영어", "총점", "평균" };

	          for( int i = 0 ; i < 3; i++ ) {
	        	  System.out.println(str[i]+ "입력:");
	        	  arr[i] = sc.nextInt();
	        	  arr[3] += arr[i];
	           }

	           arr[4] = arr[3] / 3;

	           for (int i = 0; i < str.length; i++) {
	                System.out.print(str[i] + "\t");
	           }
	           System.out.println();

	           for (int i = 0; i < arr.length; i++) {
	                System.out.print(arr[i] + "\t");
	           }

	     }
	}

