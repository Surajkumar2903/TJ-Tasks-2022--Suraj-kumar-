class Solution {
public:
    int findMaxK(vector<int>& nums) {
		// sort the numbers O(nlogn)
        sort(nums.begin(), nums.end());
        int l = 0, h = nums.size() - 1;
        while(l < h){
            int sum = nums[l] + nums[h];
			// if sum is zero we have found our answer
            if(sum == 0)
                return nums[h];
			// if sum is positive then we need to push right pointer to reduce the positiveness 
            else if(sum > 0){
                h--;
            }else{
                l++;
            }
        }
		// If not found
        return -1;
    }
};
