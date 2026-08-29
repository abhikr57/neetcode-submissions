class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen=201;
        for(String i:strs){
            if(i.length()<minLen){
                minLen=i.length();
            }
        }
        for(int i=0;i<minLen;i++){
            char ch = strs[0].charAt(i);
            for(String str:strs){
                if(str.charAt(i)!=ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}