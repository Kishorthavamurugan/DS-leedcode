class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>map = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i =0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for (int i =0; i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        
    }
    for (int val:map.values())
    {
            if(val !=0){
                return false;
            }
        }
        return true;
}

}