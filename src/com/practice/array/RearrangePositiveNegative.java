package com.practice.array;


//Rearrange array in alternating positive & negative items
public class RearrangePositiveNegative {
	
	public static void main(String[] args) {
		 int arr[] = { -5, -2, 5, 2, 4,
                 7, 1, 8, 0, -8 };
    int n = arr.length;

    arrange(arr, n);
    
    System.out.println("RearrangeD array is ");
    printArray(arr, n);
	}
	
	static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
	
	static void arrange(int[] arr, int n) {
		int outOfIndex = -1;
		for(int i = 0 ; i < n ; i++) {
			
			if(outOfIndex >= 0) {
				if((arr[outOfIndex] < 0 && arr[i] >= 0 ) || (arr[outOfIndex] > 0 && arr[i] < 0)) {
					rotateArray(arr,outOfIndex,i);
					if(i-outOfIndex >=2) {
						outOfIndex+=2;
					}else {
						outOfIndex = -1;
					}
				}
				
			}
			
			if(outOfIndex == -1) {
				if((arr[i] < 0 && i%2==1 ) || (arr[i] > 0 && i%2==0))
					outOfIndex=i;
			}
			
		}
		
		
	}

	private static void rotateArray(int[] arr, int outOfIndex, int index) {
		// TODO Auto-generated method stub
		int temp = arr[index];
		for(int i = index ; i >outOfIndex;i--) {
			arr[i] = arr[i-1];
		}
		arr[outOfIndex] = temp;
		
	}

}
