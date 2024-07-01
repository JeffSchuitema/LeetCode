class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Instead of adding each value to each other value in the input array (brute force), we can convert the input array into a hashmap to reduce time complexity
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            //For each pair of numbers in the input array, there is only one combination that adds to Target. Since the first number in this pair is iterated by the for loop (nums[i]), 
            //we only need to find target - nums[i]. utilizing the Hashmap feature 'containsKey' we can check to see if nums[i] is the correct first number in the pair, saving us
            //from having to add/subtract each iteration
            Integer requiredNum = (Integer)(target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(nums[i], i);
        }
        return null;
    }
}
