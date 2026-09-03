class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();

        char map[]= new char[27];
        for(int i=1;i<27;i++){
            map[i]=(char)('A'-1+i);
        }
        while(columnNumber>26){
        int rem=columnNumber%26;
        int div=columnNumber/26;
        if(div>0){
            sb.append(map[div]);
        }
        if(rem>0){
            sb.append(map[rem]);
        }
        columnNumber=columnNumber/26;
        }
        return sb.toString();

    }
}