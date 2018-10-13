package Assignment;



public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    	   char[]  charArray = s.toCharArray();
    	   for(int i=0;i<charArray.length;i++){
    		   boolean foundRepeat=false;
    		   for(int j=0;j<charArray.length;j++){
    			   if(j==i){
    				   continue;
    			   }
    			   if(charArray[j]==charArray[i]){
    				   foundRepeat=true;
    				   break;
    			   }
    		   }
    		   if(foundRepeat==false){
    			   return i;
    		   }
    	   }
    	   return -1;
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {

    	char[] array =(""+n).toCharArray();
    	int r=0;
    	for(int i=0;i<array.length;i++){
    		r+=Integer.parseInt(""+array[i]);
    	}
    	if(r<10){
    		return r;
    	} else{
    		return addDigits(r);
    	}
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    		//TODO

    	
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==0){
    			for(int j=i+1;j<nums.length;j++){
    				nums[j-1]=nums[j];
    			}
    			nums[nums.length-1]=0;
    		}
    	}
  
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
	public String longestPalindrome(String s) {
		char[] n = s.toCharArray();
		//reverse char[]
		for(int i=0;i<n.length/2;i++){
			char tmp= n[i];
			n[i]=n[n.length-1-i];
			n[n.length-1-i]=tmp;
		}
		
		String newStr = new String(n);
		for(int i=s.length();i>0;i--){
			String r = s.substring(0, i);
			if(newStr.indexOf(r)!=-1){
				return r;
			}
		}
		return null;
    }
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    	int l=matrix.length;
        int[][] newMatrix = new int[l][l];
        for(int y=0;y<l;y++){
        	for(int x=0;x<l;x++){
        		newMatrix[y][l-1-x] = matrix[x][y];
        	}
        }
    	return newMatrix;
   }
    
    public static void main(String[] args){
    	Assignment4 am4= new Assignment4();
    	System.out.println(am4.firstUniqChar("leetcode"));
    	System.out.println(am4.firstUniqChar("loveleetcode"));
    	System.out.println(am4.addDigits(38));
    	System.out.println(am4.addDigits(138));
    	int[] nums={0,1,0,3,12};
    	am4.moveZeroes(nums);
    	//print
    	for(int i=0;i<nums.length;i++){
    		System.out.print(nums[i]+" ");	
    	}
    	System.out.println("");
    	String s="babad";
    	System.out.println(am4.longestPalindrome(s));
    	
    	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    	int[][] newMatrix=am4.rotate(matrix);
    	for(int i=0;i<newMatrix.length;i++){
    		int[] row = newMatrix[i];
    		for(int r=0;r<row.length;r++){
    			System.out.print(row[r]+" ");
    		}
    		System.out.println("");
    	}
    }
    
}