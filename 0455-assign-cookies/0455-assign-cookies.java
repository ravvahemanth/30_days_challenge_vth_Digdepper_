class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int left=0;
        int right=0;

        int g_size=g.length;
        int s_size=s.length;

        while(left< s_size && right  <g_size ){

            if(s[left] >= g[right]){
                right++;
            }

            left++;


        }


    return right;
        
    }
}