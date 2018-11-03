package question5;

import java.util.Arrays;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0){
            return -1;
        }
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] nums3 = new int[l1+l2];
        for(int i = 0 ; i < l1; i++){
            nums3[i] = nums1[i];
        }
        for(int j = 0; j < l2; j++){
            nums3[l1+j] = nums2[j];
        }
        Arrays.sort(nums3);
        if(nums3.length % 2 == 0){
            double a = (double)(nums3[(l1+l2)/2] + nums3[(l1+l2)/2-1]) / 2;
            return a;
        }
        else{
            return nums3[(l1+l2)/2];
        }
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(s.findMedianSortedArrays(nums1,nums2));
	}
}
