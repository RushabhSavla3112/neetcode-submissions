class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        if(nums.length == 1 && target== nums[0])
        return 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println(l+"  "+r+"  "+mid);
            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                r = mid-1;
            else if(target > nums[mid])
                l = mid+1;
            // if( (r-l)==1 && ((nums[r]!=target) || (nums[l] != target)))
            // break;
        }
        return -1;
    }
}
