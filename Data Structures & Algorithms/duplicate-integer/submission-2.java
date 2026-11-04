class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int val:map.values()){
            if(val>1){
                return true;
            }
        }
        return false;
    }
}