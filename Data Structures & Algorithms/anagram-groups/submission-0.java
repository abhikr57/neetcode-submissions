class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char  arr[] =strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }

        for(Map.Entry<String,List<String>> e :map.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
