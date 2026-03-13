class Solution {
    public boolean isAnagram(String s, String t) {
        
         char str[]=s.toCharArray();
         char trs[]=t.toCharArray();
         Arrays.sort(str);
         Arrays.sort(trs);

         if(str.length != trs.length){
            return false;
         }

         for(int i=0;i<str.length|| i<trs.length;i++){
            if(str[i] !=trs[i]){
                return false ;
            }
         }

         return true;
    }
}