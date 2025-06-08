class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> tg = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            tg.add(index[i], nums[i]);
        }
        
        int k=0;
        for(Integer i:tg){
            target[k++] = i;
        }
        return target;
    }
}
