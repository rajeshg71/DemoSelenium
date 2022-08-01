public class SumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
	int largest = arr[0];
	int smallest = arr[0];
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
		if(arr[i]>largest){
		  largest = arr[i];
		}
		else if(arr[i]<smallest){
		  smallest = arr[i];	
		}	
           sum = sum + arr[i];  
        }  
        System.out.println("largest number is " + largest);
	  System.out.println("smallest number is " + smallest);
	System.out.println("sum of all the numbers is " + sum);
    }  
}  