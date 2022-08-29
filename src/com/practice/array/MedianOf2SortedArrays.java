package com.practice.array;

public class MedianOf2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = {-1,5,6,7,9,10};
//		int[] arr2 = {-3, 0, 1,2,3,11};
		int[] arr1 = {1,2,3,6};
		int[] arr2 = {4,6,8,10};
		System.out.println(findMedian(arr1,arr2,0,arr1.length-1, 0, arr2.length-1));

		System.out.println(getMedian(arr1,arr2,0,0,arr1.length-1, arr2.length-1));

	}

	private static float findMedian(int[] arr1, int[] arr2, int start1, int end1, int start2, int end2) {

		if(end1-start1 ==1 ) {
//			if(end1-start1!=1) {
//				return 
//			}
			return ((float) Math.max(arr1[start1], arr2[start2])+(float)Math.min(arr1[end1], arr2[end2]))/2;
		}
		
		float m1 = findMed(arr1, start1, end1);
		float m2 = findMed(arr2, start2, end2);
		
		if(m1==m2) {
			return m1;
		}
		if(m1<m2) {
			return findMedian(arr1,arr2,(start1+end1+1)/2,end1,start2,(start2+end2)/2);

		}else {
			return findMedian(arr1,arr2,start1,(start1+end1)/2,(start2+end2+1)/2,end2);

		}

	}
	
	private static float findMed(int[] arr, int start, int end) {
		int n = end-start+1;
		if(n%2==0) {
			return (float)( arr[start+(n-1)/2]+ arr[start+(n-1)/2+1]) /2;
		}else {
			return (float)arr[start+n/2];
		}
	}
	
	static int getMedian(
	        int[] a, int[] b, int startA,
	        int startB, int endA, int endB)
	    {
	        if (endA - startA == 1) {
	            return (
	                       Math.max(a[startA],
	                                b[startB])
	                       + Math.min(a[endA], b[endB]))
	                / 2;
	        }
	        /* get the median of
	    the first array */
	        int m1 = median(a, startA, endA);
	 
	        /* get the median of
	    the second array */
	        int m2 = median(b, startB, endB);
	 
	        /* If medians are equal then
	    return either m1 or m2 */
	        if (m1 == m2) {
	            return m1;
	        }
	 
	        /* if m1 < m2 then median must
	    exist in ar1[m1....] and
	                ar2[....m2] */
	        else if (m1 < m2) {
	            return getMedian(
	                a, b, (endA + startA + 1) / 2,
	                startB, endA,
	                (endB + startB + 1) / 2);
	        }
	 
	        /* if m1 > m2 then median must
	    exist in ar1[....m1] and
	    ar2[m2...] */
	        else {
	            return getMedian(
	                a, b, startA,
	                (endB + startB + 1) / 2,
	                (endA + startA + 1) / 2, endB);
	        }
	    }
	 
	    /* Function to get median
	    of a sorted array */
	    static int median(
	        int[] arr, int start, int end)
	    {
	        int n = end - start + 1;
	        if (n % 2 == 0) {
	            return (
	                       arr[start + (n / 2)]
	                       + arr[start + (n / 2 - 1)])
	                / 2;
	        }
	        else {
	            return arr[start + n / 2];
	        }
	    }

}
