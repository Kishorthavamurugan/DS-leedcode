class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map= new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            int cur = numbers[i];
            int x = target - cur;
            if (map.containsKey(x)){
                return new int[] {map.get(x)+1,i+1};
            }
            map.put(cur,i);
        }
        return null;
    }
}