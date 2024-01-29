package ArraysAssignments;

public class SumnAverage {

	public static void main(String[] args) {
		int anArray[]= {0,2,2,4};
		int sum =anArray[0]+anArray[1]+anArray[2]+anArray[3];
		double average=sum/anArray.length;
		System.out.println("sum of array is "+sum);
		System.out.println("Average of array is "+average);
	}

}
