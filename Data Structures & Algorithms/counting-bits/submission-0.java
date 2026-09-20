class Solution {
    public int[] countBits(int n) {
        int res[]= new int[n+1];
        res[0]=0;
        if(n==0)
        return res;
        for(int i=1;i<=n;i++){
            int cnt=0;
            int num = i;
            while(num!=0){
                num= num & (num-1);
                cnt++;
            }
            res[i]=cnt;
        }
        return res;
    }
}
