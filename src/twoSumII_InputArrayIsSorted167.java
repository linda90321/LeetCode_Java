
/*Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2*/

// Two pointer question
public class twoSumII_InputArrayIsSorted167 {
	public int[] twoSum(int[] numbers, int target) {
		int[] res=new int[2];
		if(numbers.length < 2 || numbers == null)
			return res;
		int l=0;
		int r=numbers.length-1;
		while(l<r){
			if(numbers[l]+numbers[r] < target)
				l++;
			else if(numbers[l]+numbers[r] > target)
				r--;
			else if(numbers[l]+numbers[r] == target){
				res[0]=l+1;
				res[1]=r+1;
			}
		}
		return res;
	}
}
