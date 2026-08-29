class Solution {
    public int maxDifference(String s) {
        int arr []= new int[26];
        int max=0;
        int min=100;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i:arr){
            if(i%2==0 && i!=0){
                min=Math.min(min,i);
                
            }else if(i!=0){
                max=Math.max(max,i);
                 
            }
        }
        return max-min;

    }
}