class Solution {
    public String convertToTitle(int columnNumber) {
        
        String sb = "";

        char map[]= new char[26];
        for(int i=0;i<26;i++){
            map[i]=(char)('A'+i);
        }
        int rem=0;
        while(columnNumber>0){
            columnNumber-=1;
            rem=columnNumber%26;
            sb=map[rem]+sb;
            columnNumber=columnNumber/26;
        }
       return sb;

    }
}