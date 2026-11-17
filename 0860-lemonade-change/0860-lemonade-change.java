class Solution {
    public boolean lemonadeChange(int[] arr) {

        int five=0;
        int ten=0;
        


        for(int i =0;i<arr.length;i++){

            
          if (arr[i] != 5 && arr[i] != 10 && arr[i] != 20) {
                 return false;
            }




            if(arr[i]==5 ){
                five++;
  
            }

            if(arr[i] == 10){
                ten++;
              
                if(five>0){
                      five--;
                }else{
                    return false;
                }
            }else if (arr[i] == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
        }

            
        }

        return true;
        
    }
}