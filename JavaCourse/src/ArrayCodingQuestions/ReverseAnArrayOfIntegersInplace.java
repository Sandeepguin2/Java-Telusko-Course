 package ArrayCodingQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArrayOfIntegersInplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		reverseArrayInPlace(arr);

			
		
		

	}

	private static void reverseArrayInPlace(int[] arr) {
		// TODO Auto-generated method stub
		IntStream.range(0, arr.length/2).forEach(i->{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		});
		System.out.println(Arrays.toString(arr));
		
		
	}

}
