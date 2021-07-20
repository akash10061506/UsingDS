package com.DS.Example;

public class FrequencyCheck {

	public static void main(String[] args) {
	int	arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
	 int count[] = new int[arr.length];
	 
	 for(int i=0;i < arr.length ; i++)
	 {
		 count[i] = 1;
	  for(int j = i+1; j<arr.length ; j++)   
	  {
		  if(arr[i]==arr[j])
		  {
			
			  count[i]++;
			  
		  }
	  }
	}	 
//	 for(int i=0;i < arr.length ; i++)
//	 {
//		
//		
//			 System.out.println(arr[i]);
//			
//	 }

	 for(int i=0;i < arr.length ; i++)
	 {
		 if(arr[i] != 0)
		 {
			 System.out.println(arr[i] + " is frequency " + count[i]);
			
		 }
	 }

}
}
