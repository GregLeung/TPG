import java.util.Arrays;


public class GetMedian {
	public double getMedian(int[] arr){
		double median = 0;
		//sort the array
		Arrays.sort(arr);
		//find the median
		if(arr.length % 2 == 0){
			/*if the array contain even number of elements, the median would be the average between:
			 *arr.length/2 - 1 th element and arr.length/2 th element
			 *i.e. for [0,1,2,3,4,5,6,7], the median would be avg between 8/2-1 th element 3 and 8/2 th element 4.
			*/
			median = ((double)arr[arr.length/2 - 1] + arr[arr.length/2])/2;
			
		}else{
			//if the array contain odd number of elements, the median would be the arr.length/2 th element.
			median = arr[arr.length/2];
		}
		return median;
	}
}
